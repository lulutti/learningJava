package academy.devdojo.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest06 {
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


        // Exercício para encontrar emails
        System.out.println("Regex para encontrar emails");


        String meuRegex = "([a-z0-9])+@(mail|gmail|outlook|hotmail).com"; // minha resolução
        String regex = "([a-z-A-Z0-9\\._-])+@([a-zA-Z)])+(\\.([a-zA-Z])+)+";

        String emails = "luffy@hotmail.com, malludra@gmail.com, 123jotaro@outlook.com, #$%%, #!zoro@mail.br, teste@gmail.com, sakura@mail";
        System.out.println("#!zoro@mail.br".matches(regex)); // valida se a string em questão bate com a regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emails);

        System.out.println("Hexadecimais encontrados:");

        while(matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
