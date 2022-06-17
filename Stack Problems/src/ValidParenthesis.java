import java.util.HashMap;
import java.util.Stack;

// my solution
public class ValidParenthesis {
    public boolean isValid(String s) {
        char[] inp = s.toCharArray();
        int len = inp.length;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        for (int i = 0; i < len; i++) {
            if (inp[i] == '(' || inp[i] == '[' || inp[i] == '{') {
                stack.push(inp[i]);
            } else {
                if (stack.isEmpty() || inp[i] != map.get(stack.peek())) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
