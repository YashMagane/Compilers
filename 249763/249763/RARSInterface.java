import rars.AssemblyException;
import rars.SimulationException;
import rars.api.Options;
import rars.api.Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RARSInterface
{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }

        Options op = new Options();
        op.maxSteps = 1000000;

        Program p = new Program(op);

        StringBuilder stub = new StringBuilder();

        // return value
        stub.append("""
                .text
                            
            # bootstrap loader that runs main()
            
            boot:
                        
            sw          x0, (sp)
            addi        sp, sp, -4
            """);

        for (int i = args.length - 1; i >= 0; --i) {

            if (args[i].equals("true")) {

                stub.append("""
                    addi        t0, x0, 1
                    sw          t0, (sp)
                    addi        sp, sp, -4
                    """);

            } else if (args[i].equals("false")) {

                stub.append("""
                    sw          x0, (sp)
                    addi        sp, sp, -4
                    """);

            } else {

                try {

                    stub.append(
                        String.format("""
                        li          t0, %d
                        sw          t0, (sp)
                        addi        sp, sp, -4
                        """, Integer.parseInt(args[i]))
                        );

                } catch (NumberFormatException nfe) {
                    throw new RuntimeException(nfe);
                }

            }

        }

        stub.append("""
            jal         t0, next_instruction
           
            next_instruction:
           
            addi        t0, t0, 16
            sw          t0, (sp)
            addi        sp, sp, -4
            j           main
            lw          a0, 4(sp)
            addi        sp, sp, 4
            li          a7, 10
            ecall
            """);

        try {
            p.assembleString(stub.toString() + sb.toString());
        } catch (AssemblyException ae){
            throw new RuntimeException(ae);
        }

        p.setup(null, "");

        String terminationReason;
        try {
            terminationReason = p.simulate().toString();
        } catch (SimulationException se){
            throw new RuntimeException(se);
        }

        System.out.println(p.getSTDOUT());
        System.out.println(terminationReason);
        System.out.println(p.getRegisterValue("a0"));

    }

}
