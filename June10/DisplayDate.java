

import java.time.LocalDate;

public class DisplayDate {
    public static void main(String[] args) {
        LocalDate obj= LocalDate.now().minusDays(10);
        System.out.println(obj);

    }
}
