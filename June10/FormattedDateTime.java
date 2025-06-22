import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Date and Time before formatting: "+obj);
        DateTimeFormatter format= DateTimeFormatter.ofPattern("D, E, dd-MMMM-yyyy");
        //E -> day of the week
        //D -> day of the year
        //d -> date(1-31)
        //MMM -> month name(Jan-Dec)
        //MM -> month number(1-12)
        //yy or yyyy -> year
        String formattedDateTime=obj.format(format);
        System.out.println("Date and Time after formatting: "+formattedDateTime);
    }
}
