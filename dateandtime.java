import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class dateandtime {
    public static void main(String[] args) {
    LocalDate currentdate = LocalDate.now();
    LocalTime currentTime = LocalTime.now();

        LocalDate upgrateddate = currentdate.plusDays(10);

        LocalDate monthtwoago = currentdate.minusMonths(2);
    LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("today date " + currentdate);
        System.out.println("today date " + currentTime);
        System.out.println("today date " + currentDateTime);
        System.out.println("today date " + upgrateddate);
        System.out.println("today date " + monthtwoago);
    }
}
