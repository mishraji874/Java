import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class JavaTimeClasses {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);
        System.out.println(odt.toZonedDateTime());

        ZonedDateTime zd = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zd);

        MonthDay md = MonthDay.now();
        System.out.println(md);

        Period p = Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);
    }
}
