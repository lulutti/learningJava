package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        // Também uma classe para medir o intervalo entre datas
        // Porém, o retorno é em Strings, como "2 years, 3 months and 4 days
        // Aceita apenas LocalDate

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(54);

        Period p1 = Period.between(now, nowAfterTwoYears);
        System.out.println(p1);

        Period p2 = Period.ofWeeks(58);
        System.out.println(Period.ofDays(80));
        System.out.println(Period.ofYears(24));

        System.out.println(now.until(now.plusDays(p2.getDays()), ChronoUnit.MONTHS));
    }
}
