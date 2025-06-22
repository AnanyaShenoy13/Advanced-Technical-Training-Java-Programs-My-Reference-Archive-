import java.time.LocalTime;

public class DisplayTime {
    public static void main(String[] args) {
        LocalTime obj=LocalTime.now().minusMinutes(5);
        System.out.println(obj);
    }
}
