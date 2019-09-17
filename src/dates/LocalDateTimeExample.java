package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class LocalDateTimeExample {

    public static void main(String[] args) {

       LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

       LocalDateTime secondDateTime = LocalDateTime.of(2019,03, 22, 10, 10, 00);

        System.out.println(secondDateTime);

        LocalDateTime thirdDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        System.out.println(thirdDateTime);
        System.out.println(thirdDateTime.getHour());
        System.out.println(thirdDateTime.getMinute());
        System.out.println(thirdDateTime.getDayOfMonth());

        System.out.println(thirdDateTime.get(ChronoField.YEAR));

        System.out.println(localDateTime.plusDays(2));
        System.out.println(localDateTime.withMonth(1));

        System.out.println(localDateTime.plus(1, ChronoUnit.MINUTES));


        LocalDate localDate = LocalDate.of(2019, 01, 01);
        System.out.println(localDate.atTime(10, 12));

        LocalTime localTime  = LocalTime.of(20, 20, 10);
        LocalDateTime localDateTime1 = localTime.atDate(localDate);

        System.out.println(localDateTime1.toLocalDate());
        System.out.println(localDateTime1.toLocalTime());



    }
}
