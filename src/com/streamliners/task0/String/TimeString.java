import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeString {
    public static void main(String[] args){
        String string = "2021-04-01";
        LocalDate date= LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
