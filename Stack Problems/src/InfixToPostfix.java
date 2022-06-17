import java.util.Stack;

public class InfixToPostfix {
    public String convert(String s) {
        char[] infix = s.toCharArray();
        int len = infix.length;
        char[] postfix = new char[len + 2];
        Stack<Character> stack = new Stack<>();
        stack.push('#');
        int i = 0, j = 0;
        while (i < len) {
            if (isOperand(infix[i])) {
                postfix[j++] = infix[i++];
            } else {
                // an operator
                if (precedence(infix[i]) > precedence(stack.peek())) {
                    stack.push(infix[i++]);
                } else {
                    postfix[j++] = stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            postfix[j++] = stack.pop();
        }
        return postfix.toString();
    }

    private boolean isOperand(char c) {
        if (c == '*' || c == '+' || c == '-' || c == '/') {
            return false;
        }
        return true;
    }

    private int precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        }
        return 0;
    }
}
