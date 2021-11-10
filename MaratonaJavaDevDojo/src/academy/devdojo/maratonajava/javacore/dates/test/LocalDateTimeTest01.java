package academy.devdojo.maratonajava.javacore.dates.test;

import academy.devdojo.maratonajava.javacore.associacao.exercicio.domain.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        // Junção de LocalDate e LocalTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(now.format(formatter));

        LocalDate birthday = LocalDate.parse("1997-06-28");
        LocalTime birthdayTime = LocalTime.parse("23:55:00");

        System.out.println(birthday);
        System.out.println(birthdayTime);

        // Add uma hora a uma data e vice-versa
        System.out.println(birthday.atTime(birthdayTime));
        System.out.println(birthdayTime.atDate(birthday));




    }
}
