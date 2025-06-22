import java.time.LocalDateTime;

public class DisplayDateandTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj.getDayOfYear()+" ");
    }
}
