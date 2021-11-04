package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("lulutti");
        Time time = new Time("Clash 01");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
