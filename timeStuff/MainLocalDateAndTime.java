package timeStuff;

import java.time.*;

public class MainLocalDateAndTime {
    public static void main(String[] args) {
        createDatesAndTimes();
        System.out.println("------------");
        addAndSubtract();
        System.out.println("------------");
        useOfLocalDateTime();
        System.out.println("------------");
        useOfInstant();
    }

    private static void createDatesAndTimes(){
        System.out.println("today: " + LocalDate.now());
        System.out.println("day1: " + LocalDate.of(2020, 12, 1)); //range 1-12, 1-31
        System.out.println("day2: " + LocalDate.of(2021, Month.DECEMBER, 1));

        System.out.println("this time: " + LocalTime.now());
        System.out.println("other time: " + LocalTime.of(0, 59, 59)); //range 0-23, 0-59
    }

    private static void addAndSubtract(){
        LocalDate firstDayYear = LocalDate.of(2021,1,1);
        System.out.println("15 june: " + firstDayYear.plusDays(14));
        System.out.println("1 february: " + firstDayYear.plusDays(31));
        System.out.println("last day previous year: " + firstDayYear.minusDays(1));
    }

    private static void useOfLocalDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("dateTime now: " + now);

        LocalDate currentDate = now.toLocalDate();
        LocalTime currentTime = now.toLocalTime();
        System.out.println("divided: " + currentDate + " - " + currentTime);
    }

    private static void useOfInstant(){
        System.out.println("Instant now: " + Instant.now());
        System.out.println("One hour after reference (1970) v1: " + Instant.ofEpochMilli(3600000));
        System.out.println("One hour after reference (1970) v2: " + Instant.ofEpochSecond(3600));

        System.out.println("seconds from origin: " + Instant.now().getEpochSecond());
    }
}
