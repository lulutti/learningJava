package academy.devdojo.maratonajava.javacore.dates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Deprecated
        Date date = new Date(); // Long em milessegundos desde 1 de janeiro de 1970

        System.out.println(date.getYear()); // 121
        System.out.println(date); // < date.toString()Tue Nov 09 17:27:01 BRT 2021
        System.out.println(date.getTime()); // 1636489685864 long do dia de hoje


    }
}
