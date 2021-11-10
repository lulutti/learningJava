package academy.devdojo.maratonajava.javacore.formatacao.simpledateformart;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM d, ''yy");

        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("qua., nov. 10, '21"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
