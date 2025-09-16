import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class dateAndTimeInJava {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDateTime dateandtime = LocalDateTime.now();
        System.out.println(today);
        System.out.println(dateandtime);

        LocalDate specficDate = LocalDate.of(2025, 9, 16);
        System.out.println(specficDate);

        LocalDate afterday = today.minusDays(1);
        System.out.println(afterday);


        ZonedDateTime zonetime = ZonedDateTime.now();
        System.out.println(zonetime);

        Instant now = Instant.now();
        System.out.println("Current Timestamp: " + now);

    }
}
