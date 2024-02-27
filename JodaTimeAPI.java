import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class JodaTimeAPI {
    public static void main(String[] args) {
        Date d = new Date();
        d.setHours(21);
        System.out.println(d);

        LocalDate dt = LocalDate.now();
        System.out.println(dt);
        LocalDate ld= LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(ld);
        LocalDate l = LocalDate.of(2020, Month.MARCH,10);
        System.out.println(l);
        LocalDate ld1 = LocalDate.ofEpochDay(1000);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.parse("2020-01-03");
        System.out.println(ld2);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        LocalTime lt1 = lt.minusHours(3);
        System.out.println(lt1);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
