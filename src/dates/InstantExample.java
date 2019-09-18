package dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(instant.getEpochSecond());

        Instant instant1 = Instant.now();

        Duration duration = Duration.between(instant, instant1);
        System.out.println(duration.getNano());
    }
}
