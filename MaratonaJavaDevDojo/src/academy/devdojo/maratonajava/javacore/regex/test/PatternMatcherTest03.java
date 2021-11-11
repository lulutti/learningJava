package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //Meta caracteres
        // \d = todos os digitos do texto
        // \D = tudo o que não for digito
        // \s = todos os espaços em branco \t \n \f \r
        // \S = todos os caractres que não estão em branco
        // \w = a-ZA-Z, digitos
        // \W = tudo o que não for incluso no \w
        String regex = "\\w";

        String texto = "wq#e89ussuq 89";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indices: " + "0123456");
        System.out.println("Texto: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");


        }
    }
}
