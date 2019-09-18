package dates;

import java.time.*;
import java.util.Date;

public class DateToLocalDateExample {

    public static void main(String[] args) {

        Date date  = new Date();
        System.out.println(date);

        LocalDate localdate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localdate);

        Date date1 = new Date().from(localdate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date1);

        Date date2 = new Date().from(Instant.now());
        System.out.println(date2);
    }
}
