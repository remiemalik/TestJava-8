package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate anotherLocalDate = LocalDate.of(2019, 7, 17);
        System.out.println(anotherLocalDate);

        LocalDate secondsLocalDate = LocalDate.ofYearDay(2018, 365);
        System.out.println(secondsLocalDate);

        System.out.println(secondsLocalDate.getMonth());
        System.out.println(secondsLocalDate.getMonthValue());
        System.out.println(secondsLocalDate.getDayOfWeek());
        System.out.println(secondsLocalDate.getDayOfYear());
        System.out.println(secondsLocalDate.get(ChronoField.DAY_OF_MONTH));

        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.plusMonths(2));
        System.out.println(localDate.minusDays(14));
        System.out.println(localDate.withYear(2019));
        System.out.println(localDate.with(ChronoField.YEAR, 2020));
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println(localDate.minus(1, ChronoUnit.YEARS));

        System.out.println(LocalDate.ofYearDay(2020, 01).isLeapYear());

        System.out.println(localDate.isEqual(secondsLocalDate));
        System.out.println(localDate.isBefore(secondsLocalDate));
        System.out.println(localDate.isAfter(secondsLocalDate));

        System.out.println(localDate.isSupported(ChronoUnit.MINUTES));

    }
}
