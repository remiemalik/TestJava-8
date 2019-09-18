package dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7, 20);
        LocalTime localTime2 = LocalTime.of(8, 20);

        long diff = localTime.until(localTime2, ChronoUnit.MINUTES);
        System.out.println(diff);

        Duration duration = Duration.between(localTime, localTime2);
        System.out.println(duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println(duration1.toMinutes());

        Duration duration2 = Duration.ofMinutes(10);
        System.out.println(duration2.toMinutes());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(2);
        Duration duration3 = Duration.between(localDate, localDate1);


    }
}
