package academy.devdojo.maratonajava.javacore.formatacao.locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // Internacionalização de datas
        Locale localeBR = new Locale("PT","BR");
        Locale localeIT = new Locale("IT","IT");
        Locale localeES = new Locale("ES","ES");

        Calendar calendar = Calendar.getInstance();
        DateFormat dateBR = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat dateIT = DateFormat.getDateInstance(DateFormat.FULL, localeIT);
        DateFormat dateES = DateFormat.getDateInstance(DateFormat.FULL, localeES);

        System.out.println("Brasil " + dateBR.format(calendar.getTime()));
        System.out.println("Itália " + dateIT.format(calendar.getTime()));
        System.out.println("Espanha " + dateES.format(calendar.getTime()));

        System.out.println(localeES.getDisplayCountry());
        System.out.println(localeES.getDisplayLanguage());
        System.out.println(localeES.getDisplayCountry(localeIT));

    }
}
