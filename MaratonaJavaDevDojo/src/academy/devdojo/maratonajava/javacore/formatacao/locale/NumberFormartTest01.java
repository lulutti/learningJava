package academy.devdojo.maratonajava.javacore.formatacao.locale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormartTest01 {
    public static void main(String[] args) {
        // Internacionalização de números
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("PT","BR");
        Locale localeIT = new Locale("IT","IT");
        Locale localeES = new Locale("ES","ES");
        Locale localeUS = Locale.US;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance(localeUS);
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeES);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }


        String valorString = "10_000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
