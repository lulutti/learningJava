package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class obterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {

        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));

        int addDays;

        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }

        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}


public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new obterProximoDiaUtil());
        System.out.println(now.getDayOfWeek());

        LocalDate friday = LocalDate.of(2021,11,12);

        System.out.println(friday.with(new obterProximoDiaUtil()));

    }
}
