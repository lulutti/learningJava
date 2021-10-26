package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.dominio.*;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Luiza";
        estudante1.idade = 24;
        estudante1.sexo = 'F';

        estudante2.nome = "Kauã";
        estudante2.idade = 26;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();
    }
}
