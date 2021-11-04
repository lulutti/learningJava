package academy.devdojo.maratonajava.javacore.associacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.associacao.exercicio.domain.Estudante;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.associacao.exercicio.domain.Seminario;

public class Main {
    public static void main(String[] args) {
        Local local1 = new Local("Palco Uva");
        Local local2 = new Local("Palco Banana");
        Local local3 = new Local("Palco Mamão");

        Seminario seminario1 = new Seminario("Sobremesas veganas",local1);
        Seminario seminario2 = new Seminario("Veganismo x vegetarianismo",local2);
        Seminario seminario3 = new Seminario("Pizzas Veganas",local3);

        Professor professor1 = new Professor("Heitor","Gastronomia Saudavel", new Seminario[]{seminario1, seminario3});
        Estudante estudante1 = new Estudante("Paulo",28);

        estudante1.setSeminario(seminario3);
        seminario3.setAlunos(new Estudante[]{estudante1});

        seminario1.imprime();
        seminario2.imprime();
        seminario3.imprime();

        professor1.imprime();

        estudante1.imprime();

    }
}
