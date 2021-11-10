package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        // Ajuste de datas (CONTROLE)
        LocalDate now = LocalDate.now();

        // Soma os dias, e vira o mês se preciso
        now = now.plusDays(20);
        System.out.println(now);

        // O dia se torna 20, e o restante da data não é alterado
        now = now.withDayOfMonth(20);
        System.out.println(now);

        // Vai retornar a próxima Segunda
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println(now);

        // Vai retornar o último sábado
        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY));
        System.out.println(now);

        // Primeiro dia do mês
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);

        // Último dia do mês
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
    }

}
