package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // Quantificadores
        // metacaracteres baseados em quantidade
        // ? Zero ou uma ocorrência
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // | OU ex = o(v|c)o vai retornar ovo ou oco
        // $ fim da linha
        // . caracter coringa


        // Exercícios encontrar os números hexadecimais em um texto
        System.out.println("Regex para encontrar hexadecimais");
        String textoHex = "12 0x 0X 0xFFABC 0x10G 0x1";
        String regexHex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        Pattern patternHex = Pattern.compile(regexHex);
        Matcher matcherHex = patternHex.matcher(textoHex);

        System.out.println("Hexadecimais encontrados:");

        while(matcherHex.find()){
            System.out.print(matcherHex.start() + " " + matcherHex.group() + "\n");
        }
    }
}
