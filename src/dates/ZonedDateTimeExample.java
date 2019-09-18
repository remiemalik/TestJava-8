package dates;

import java.time.*;

import static java.time.LocalDateTime.ofInstant;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println(zonedDateTime.getOffset());
        System.out.println(zonedDateTime.getZone());

        ZoneId.getAvailableZoneIds()
                .stream().forEach((zone-> System.out.println(zone)));

        System.out.println(ZoneId.getAvailableZoneIds().size());

        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Detroit")));

        System.out.println(ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
        System.out.println(localDateTime2);

        LocalDateTime localdatetime3 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(localdatetime3);

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        System.out.println(localDateTime1.atZone(ZoneId.of("America/Chicago")));

        System.out.println(Instant.now().atZone(ZoneId.of("America/Detroit")));

        System.out.println(localdatetime3.atOffset(ZoneOffset.ofHours(1)));

    }
}
