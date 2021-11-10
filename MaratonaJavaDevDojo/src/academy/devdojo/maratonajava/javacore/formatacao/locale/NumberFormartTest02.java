package academy.devdojo.maratonajava.javacore.formatacao.locale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormartTest02 {
    public static void main(String[] args) {
        // Internacionalização de moedas
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("PT","BR");
        Locale localeIT = new Locale("IT","IT");
        Locale localeES = new Locale("ES","ES");
        Locale localeUS = Locale.US;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeES);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(1);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$10000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));

        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
