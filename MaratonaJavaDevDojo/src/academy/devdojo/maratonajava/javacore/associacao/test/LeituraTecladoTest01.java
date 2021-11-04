package academy.devdojo.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        String nome = inputKeyboard.nextLine();

        System.out.println("Qual é a sua idade?");
        int idade = inputKeyboard.nextInt();

        System.out.println("Qual é a sua profissão?");
        String profissao = inputKeyboard.next();



        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);


    }
}
