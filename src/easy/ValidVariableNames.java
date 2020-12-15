package easy;

public class ValidVariableNames {

    public static boolean variableValid(String variable) {
        if(variable.contains(" ") || Character.isDigit(variable.charAt(0))) {
            return false;
        }
        return true;
    }

}

/*
When creating variables, the variable name must always start with a letter and
cannot contain spaces, though numbers and underscores are allowed to be contained in it also.

Create a function which returns true if a given variable name is valid, otherwise return false.
Examples
variableValid("result") ➞ true
variableValid("odd_nums") ➞ true
variableValid("2TimesN") ➞ false
Notes
Inputs are given as strings.
Variable names with spaces are not allowed.
Although this question may seem like otherwise, you can't actually assign words with
quotes around them as variables.
 */
