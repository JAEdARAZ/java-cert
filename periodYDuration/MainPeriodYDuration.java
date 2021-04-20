package periodYDuration;

import java.time.Duration;
import java.time.Period;

public class MainPeriodYDuration {
    public static void main(String[] args) {
        periodExamples(); //dates (year, month, day)
        durationExamples(); //time (day, minutes, hours, seconds)
    }

    private static void periodExamples(){
        Period p = Period.ofMonths(10);
        System.out.println("period: " + p.plusMonths(5)); //P15M
        System.out.println("period normalized: " + p.plusMonths(5).normalized()); //P1Y3M
        System.out.println("with removes whatever was there: " + p.withMonths(8)); //P8M
    }

    private static void durationExamples(){
        Duration d = Duration.ofMinutes(119);
        System.out.println("duration: " + d); //readjusts automatically, PT1H59M
        System.out.println("cast to hours: " + d.toHours()); //doesn't round (this gives 1H)
    }
}
