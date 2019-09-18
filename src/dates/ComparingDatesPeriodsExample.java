package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ComparingDatesPeriodsExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018, 01 ,01);
        LocalDate secondDate = LocalDate.of(2018, 12, 31);

        Period period = localDate.until(secondDate);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println(period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println(period2.getYears());
        System.out.println(period2.toTotalMonths());

        Period period3 = Period.between(localDate, secondDate);
        System.out.println(period3.getDays() + " " + period3.getMonths() + " " + period3.getYears());


    }
}
