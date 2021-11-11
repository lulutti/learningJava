package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // Metacaracter range
        // []
        String regex = "[abcABC]"; //procure por a ou b ou c ou A ou B ou C
        String regex2 = "[a-zA-C]"; //range de a a z minusculo e A a C maiusculo

        String texto = "cafeBEBE";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indices: " + "0123456");
        System.out.println("Texto: " + regex2);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }



        int numeroHex = 0X59F86A;
        System.out.println(numeroHex);



        // Exercícios encontrar os números hexadecimais em um texto
        System.out.println("Regex para encontrar hexadecimais");
        String textoHex = "12 0x 0X 0xFFABC 0x109 0x1";
        String regexHex = "0[xX][0-9a-fA-F]";
        Pattern patternHex = Pattern.compile(regexHex);
        Matcher matcherHex = patternHex.matcher(textoHex);

        System.out.println("Hexadecimais encontrados:");

        while(matcherHex.find()){
            System.out.println(matcherHex.start() + " " + matcherHex.group() + "\n");
        }
    }
}
