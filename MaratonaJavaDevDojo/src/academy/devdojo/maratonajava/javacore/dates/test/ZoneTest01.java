package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;

        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);

        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokyoZone);

        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneManaus = ZoneOffset.of("-09:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneManaus);
        System.out.println(offsetDateTime);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());

        System.out.println(japaneseDate);


    }
}
