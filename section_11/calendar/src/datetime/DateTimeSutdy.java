package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSutdy {
    public static void main(String[] args) {

        // creating object as format was customized
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); // current date object
        LocalDateTime d02 = LocalDateTime.now(); // date current time object
        Instant d03 = Instant.now(); // current time object with timezone

        LocalDate d04 = LocalDate.parse("2023-04-20"); // localdate object in String format
        LocalDateTime d05 = LocalDateTime.parse("2022-04-20T09:53:26"); // localdatetime object in String format
        Instant d06 = Instant.parse("2022-04-20T09:53:26Z"); // instant object in String format with timezone

        LocalDate d07 = LocalDate.parse("20/04/2023", fmt1);
        LocalDateTime d08 = LocalDateTime.parse("24/04/2023 20:14", fmt2);

        LocalDate d09 = LocalDate.of(2023, 04, 24);
        LocalDateTime d10 = LocalDateTime.of(2023, 04, 24, 8, 19);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.err.println("d08 = " + d08);
        System.err.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
    }
}
