package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        // Semelhante a date
        // Trabalha com nanossegundos de 1970 até agora
        // Um instante de um ponto de uma timeline

        Instant now = Instant.now(); // em zulu time / utc


        System.out.println(now);
        System.out.println(LocalDateTime.now()); // Em horário local

        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // Nanossegundo de 1 segundo


    }
}
