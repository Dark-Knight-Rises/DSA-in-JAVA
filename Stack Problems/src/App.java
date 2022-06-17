public class App {
    public static void main(String[] args) throws Exception {
        // ValidParenthesis2 obj = new ValidParenthesis2();
        EvaluationOfPostfix obj = new EvaluationOfPostfix();
        // InfixToPostfix obj = new InfixToPostfix();
        String s = "35*62/+4-";
        System.out.println("Postfix: " + obj.evaluate(s));
    }
}
