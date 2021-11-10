package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // Deprecated também, mas é visto em sistemas legados
        // Calendar é abstract, não pode ser instanciado com New
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY) System.out.println("Domingo é o primeiro dia da semana");

        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        Date date = c.getTime();
        System.out.println(date);

        c.add(Calendar.HOUR,2); // Acrescentando 2 horas ao valor hora

    }
}
