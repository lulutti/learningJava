package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2022, Month.JANUARY,27);

        LocalDate agora = LocalDate.now();

        // métodos de local date
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear()); // boolean ano bissexto

        System.out.println(date.get(ChronoField.YEAR_OF_ERA));


        System.out.println(agora);

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        agora.plusDays(5); // é imutável, não vai alterar a variável original
        LocalDate agoraPlus = agora.plusDays(5); // é necessário criar um novo objeto

        System.out.println(agora);
        System.out.println(agoraPlus);


        LocalDate endTime = LocalDate.of(2021,Month.DECEMBER,20);
        System.out.println(endTime.compareTo(agora));
        System.out.println(agora.getChronology());


    }
}
