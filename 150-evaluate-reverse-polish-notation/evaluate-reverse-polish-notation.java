class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {

            // IMPORTANT:
            // In Java:
            // "" -> String
            // '' -> char
            // Since 't' is a String, always compare using:
            // t.equals("+"), t.equals("-"), etc.
            // NOT t.equals('+') because '+' is a char.

            if (!t.equals("+") &&
                !t.equals("-") &&
                !t.equals("*") &&
                !t.equals("/")) {

                stack.push(Integer.parseInt(t));

            } else {

                // IMPORTANT:
                // Stack is LIFO (Last In, First Out)
                // The FIRST pop is the RIGHT operand.
                // The SECOND pop is the LEFT operand.
                //
                // Example:
                // Expression: 4 2 -
                // Stack:
                // Top
                // 2   <-- pop first (right operand)
                // 4   <-- pop second (left operand)
                //
                // Correct:
                // 4 - 2
                // NOT
                // 2 - 4

                int right = stack.pop();
                int left = stack.pop();

                if (t.equals("+")) {
                    stack.push(left + right);
                } else if (t.equals("-")) {
                    stack.push(left - right);
                } else if (t.equals("*")) {
                    stack.push(left * right);
                } else { // "/"
                    stack.push(left / right);
                }
            }
        }

        return stack.pop();
    }
}