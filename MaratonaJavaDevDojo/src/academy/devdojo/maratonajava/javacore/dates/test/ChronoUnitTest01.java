package academy.devdojo.maratonajava.javacore.dates.test;

import academy.devdojo.maratonajava.javacore.associacao.exercicio.domain.Local;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(1997, Month.JUNE, 28, 23, 55);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.SECONDS.between(birthday, now) + " Seconds");
        System.out.println(ChronoUnit.MINUTES.between(birthday, now) + " Minutes");
        System.out.println(ChronoUnit.HOURS.between(birthday, now) + " Hours");
        System.out.println(ChronoUnit.DAYS.between(birthday, now) + " Days");
        System.out.println(ChronoUnit.WEEKS.between(birthday, now) + " Weeks");
        System.out.println(ChronoUnit.MONTHS.between(birthday, now) + " Months");
        System.out.println(ChronoUnit.YEARS.between(birthday, now) + " Years");

        System.out.println(birthday.plusDays(10000));
        System.out.println(birthday.plusWeeks(2000));
    }

}
