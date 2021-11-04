package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professorHistoria = new Professor("Mauricio");
        Professor professorGeografia = new Professor("Carla");

        Professor[] professores = {professorHistoria,professorGeografia};
        Escola escola = new Escola("Colégio Ouro", professores);

        escola.imprime();


    }
}
