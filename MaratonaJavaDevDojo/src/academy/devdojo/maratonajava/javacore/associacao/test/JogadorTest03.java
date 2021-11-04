package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador04 = new Jogador("Kaka");
        Time time = new Time("Brasil");
        Jogador jogadores[] = {jogador04};

        jogador04.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("Jogadores-");
        jogador04.imprime();
        System.out.println("----------");
        System.out.println("Times-----");
        time.imprime();
        System.out.println("----------");
    }
}
