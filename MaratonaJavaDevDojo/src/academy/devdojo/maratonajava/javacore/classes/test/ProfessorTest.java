package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "DevDojo";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println(professor.nome + professor.idade + professor.sexo);

    }
}
