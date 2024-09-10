
public class CourseWorkTypeException extends RuntimeException {

    private String msg;

    public CourseWorkTypeException() {
        super();
    }

    // Error information is to be determined separately on a case-by-case basis (see below).
    public CourseWorkTypeException(String errmsg)
    {
        msg = errmsg;
    }

    // A method to generate a report of the error as a string.
    public String report() {
        return msg;
    }

    // A method to produce an exception for the 'no main function' error.
    public CourseWorkTypeException noMainFuncError() {
        msg = "No main function defined";
        return this;
    }

    // A method to produce an exception for errors regarding main's return type
    public CourseWorkTypeException mainReturnTypeError() {
        msg = "Wrong return type declared for main function";
        return this;
    }

    // A method to produce an exception for duplicated function names
    public CourseWorkTypeException duplicatedFuncError() {
        msg = "Duplicated function names";
        return this;
    }

    // A method to produce an exception for duplicated parameter or local variable names
    public CourseWorkTypeException duplicatedVarError() {
        msg = "Duplicated variable names";
        return this;
    }

    // A method to produce an exception for parameter or local variable names that clashes with function names
    public CourseWorkTypeException clashedVarError() {
        msg = "A variable name clashed with a function name";
        return this;
    }

    // A method to produce an exception for parameters or local variables of 'unit' type.
    public CourseWorkTypeException unitVarError() {
        msg = "Variable of unit type";
        return this;
    }

    // A method to produce an exception for undefined function name
    public CourseWorkTypeException undefinedFuncError() {
        msg = "Unknown function name";
        return this;
    }

    // A method to produce an exception for undefined parameter or local variable name
    public CourseWorkTypeException undefinedVarError() {
        msg = "Unknown variable name";
        return this;
    }

    // A method to produce an exception related to mis-typed comparisons of integer values
    public CourseWorkTypeException comparisonError() {
        msg = "Invalid operand in integer comparison";
        return this;
    }

    // A method to produce an exception related to mis-typed arithmetic expressions
    public CourseWorkTypeException arithmeticError() {
        msg = "Invalid operand in arithmetic expression";
        return this;
    }

    // A method to produce an exception related to mis-typed Boolean expressions
    public CourseWorkTypeException logicalError() {
        msg = "Invalid operand in Boolean expression";
        return this;
    }

    // A method to produce an exception for 'if' statements, in which
    // the 'then' branch and the 'else' branch have different types.
    public CourseWorkTypeException branchMismatchError() {
        msg = "Mismatched expression types in if expression";
        return this;
    }

    // A method to produce an exception for if/loop conditions which are not of type bool.
    public CourseWorkTypeException conditionError() {
        msg = "Invalid condition in if expression or loop";
        return this;
    }

    // A method to produce an exception related to expressions in loop body.
    public CourseWorkTypeException loopBodyError() {
        msg = "Invalid last expression type in loop body";
        return this;
    }

    // A method to produce an exception for errors regarding function's return type.
    public CourseWorkTypeException functionBodyError() {
        msg = "Invalid return value type";
        return this;
    }

    // A method to produce an exception related to assignment.
    public CourseWorkTypeException assignmentError() {
        msg = "Incompatible types in assignment";
        return this;
    }

    // A method to produce an exception related to argument list mismatches.
    public CourseWorkTypeException argumentNumberError() {
        msg = "Invalid # of arguments in invocation";
        return this;
    }

    // A method to produce an exception related to argument type mismatches.
    public CourseWorkTypeException argumentError() {
        msg = "Invalid argument type in invocation";
        return this;
    }

    // A method to produce an exception related to print (expression not an int, space, or newline).
    public CourseWorkTypeException printError() {
        msg = "Invalid expression for print";
        return this;
    }

}
