package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeStudy2 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-04-24");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-24T20:37:05");
        Instant d06 = Instant.parse("2023-04-24T20:37:25Z");

        // creating custom formatters for date time
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // custom formatter using 'Instant' with time zone
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        // three methods of formating using custom formatters
        System.out.println("d04 = " + d04.format(fmt1)); 
        System.out.println("d04 = " + fmt1.format(d04)); 
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05 = " + d05.format(fmt1)); 
        System.out.println("d05 = " + d05.format(fmt2));

        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d05 = " + d05.format(fmt4)); // ISO_DATE_TIME
        System.out.println("d06 = " + fmt5.format(d06)); // ISO_INSTANT
    }
}
