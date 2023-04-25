package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculationDateTime {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2023-04-25"); // current date object
        LocalDateTime d02 = LocalDateTime.parse("2023-04-25T08:56:30"); // date current time object
        Instant d03 = Instant.parse("2023-04-25T08:56:30Z"); // current time object with timezone
        
        LocalDate pastWeekLocalDate = d01.minusDays(3); // -3 days
        LocalDate nexWeekLocalDate = d01.plusDays(3); // +3 days

        LocalDateTime pastWeekLocalDateTime = d02.minusDays(3); 
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(3); 

        Instant pastWeekiInstant = d03.minus(3, ChronoUnit.DAYS); // +3 units of days
        Instant nextWeekInstant = d03.plus(3, ChronoUnit.DAYS); // -3 units of days

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(pastWeekiInstant, d03);

        // localdate
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeeklocalDate = " + nexWeekLocalDate);

        // localdatetime
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeeklocalDateTime = " + nextWeekLocalDateTime);

        // instant
        System.out.println("pastWeekInstant = " + pastWeekiInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // duration
        System.out.println("t1 days = " + t1.toDays()); // localdate
        System.out.println("t2 days = " + t2.toDays()); // localdatetime
        System.out.println("t3 days = " + t3.toDays()); // instant
        


    }
    
}
