import java.util.Stack;

public class EvaluationOfPostfix {
    public int evaluate(String s) {
        char[] exp = s.toCharArray();
        int len = exp.length;
        Stack<Integer> stact = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (isOperand(exp[i])) {
                stact.push(exp[i] - '0');
            } else {
                int a, b, res = 0;
                a = stact.pop();
                b = stact.pop();
                switch (exp[i]) {
                    case '+': {
                        res = b + a;
                        break;
                    }
                    case '*': {
                        res = b * a;
                        break;
                    }
                    case '-': {
                        res = b - a;
                        break;
                    }
                    case '/': {
                        res = b / a;
                        break;
                    }
                    default:
                        break;
                }
                stact.push(res);
            }
        }
        return stact.pop();
    }

    private boolean isOperand(char c) {
        if (c == '+' || c == '*' || c == '-' || c == '/') {
            return false;
        }
        return true;
    }
}
