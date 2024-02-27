import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(df.format(ldt));

        ZonedDateTime zdt = ZonedDateTime.now();
        DateTimeFormatter dfzdt = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
        System.out.println(dfzdt.format(zdt));

        System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(ldt.get(ChronoField.AMPM_OF_DAY));
        System.out.println(ldt.get(ChronoField.YEAR));
    }
}
