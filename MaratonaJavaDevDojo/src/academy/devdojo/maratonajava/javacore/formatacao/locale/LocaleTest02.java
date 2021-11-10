package academy.devdojo.maratonajava.javacore.formatacao.locale;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());


        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        // Países suportados
        System.out.println("ISO Countries");
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+" ");
        }

        // Idiomas suportados
        System.out.println("ISO Languages");
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }


    }
}
