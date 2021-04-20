package timeFormatterYParsing;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class MainFormatterParsing {
    public static void main(String[] args) {
        noTimezone();
        System.out.println("------------");
        withTimezone();
        System.out.println("------------");
        formatting();
    }

    private static void noTimezone() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(formatter.format(currentDate));
        System.out.println(currentDate.format(formatter));
    }

    private static void withTimezone() {
        ZonedDateTime utcDateZoned = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        DateTimeFormatter formatterISO = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatterCanada = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ROOT);
        System.out.println(formatterCanada.format(utcDateZoned));
    }

    private static void formatting(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        System.out.println(formatter.format(LocalDateTime.now()));

        LocalDate fromObject = LocalDate.parse("10/05/2021", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(fromObject.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
    }
}
