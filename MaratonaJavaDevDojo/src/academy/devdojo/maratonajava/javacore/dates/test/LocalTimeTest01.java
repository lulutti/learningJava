package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(15,55);

        LocalTime now = LocalTime.now();

        System.out.println(time);
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        // Métodos LocalTime
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println(now.format(formatter));

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);


    }
}
