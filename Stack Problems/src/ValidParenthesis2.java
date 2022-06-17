import java.util.Stack;

// bari sir's solution
public class ValidParenthesis2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] exp = s.toCharArray();
        for (char c : exp) {
            if ((int) c == 40 || (int) c == 91 || (int) c == 123) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if ((int) stack.peek() == 40 && (int) c != 41) {
                    return false;
                } else if ((int) stack.peek() == 91 && (int) c != 93) {
                    return false;
                } else if ((int) stack.peek() == 123 && (int) c != 125) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
