package academy.devdojo.maratonajava.javacore.formatacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println(LocalDate.parse("20211110", DateTimeFormatter.BASIC_ISO_DATE));

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        LocalDate parseBR;
        parseBR = LocalDate.parse("10/11/2021", formatterBR);
        System.out.println(parseBR);
    }
}
