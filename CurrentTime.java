import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("EST Time: " + time.format(formatter));
    }
}