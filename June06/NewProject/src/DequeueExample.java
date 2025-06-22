import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample{
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(100);
        deque.add(2);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
