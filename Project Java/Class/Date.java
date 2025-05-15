package Class;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[]args){
        LocalDateTime myTime =LocalDateTime.now();
        System.out.println("Before: "+myTime);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E-dd-MM-yyyy HH:mm:ss");

        String cleanDate = myTime.format(myFormat);
        System.out.println("After: "+cleanDate );
    }
}
