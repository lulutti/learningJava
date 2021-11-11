package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // Uma expressão regex faz uma busca de acordo com metacaracteres passados como expressão
        // Ela utiliza duas classes:
        // 1- Pattern para compilar a expressão
        // 2- Matcher para conectar a expressão ao texto e realizar a busca com o método find

        String regex = "aba";

        String texto = "ababaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto: " + texto);
        System.out.println("Indices: " + 0123456);
        System.out.println("Texto: " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" ");
        }
        // Ele não retorna em indices que ele já computou

    }
}
