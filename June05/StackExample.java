import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        System.out.println("Stack: " + stack);
        stack.peek();
        stack.pop();
        System.out.println("Stack: " + stack);
        System.out.println(stack.contains("Me"));
        System.out.println(stack.size());
    }
}
