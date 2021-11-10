package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        // Usada para comparar o tempo entre duas datas ou horas
        // Baseada em segundos e nanossegundos
        // Não aceita a localdate, pois o retorno dos métodos dela não possuem segundos

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowAfterTwoHours = LocalTime.now().plusHours(2);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1);

        Duration d2 = Duration.between(timeNow, timeNowAfterTwoHours);
        System.out.println(d2);

        System.out.println(Duration.ofDays(20)); // Quantas horas tem em 20 dias
        System.out.println(Duration.ofMinutes(3)); // Quantos minutos tem em 3 minutos

    }
}
