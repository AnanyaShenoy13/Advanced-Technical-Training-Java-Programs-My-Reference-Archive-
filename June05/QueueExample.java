import java.util.LinkedList;
import java.util.Queue;
interface ABC{
    void display();
}
class Demo implements ABC{
    @Override
    public void display(){
        System.out.println("Displaying Demo");
    }
}
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(12);
        queue.offer(23);
        queue.offer(43);
        System.out.println("Queue: "+queue);
        queue.poll();
        System.out.println("Queue: "+queue);
        System.out.println("Front:"+queue.poll());
    }
}
