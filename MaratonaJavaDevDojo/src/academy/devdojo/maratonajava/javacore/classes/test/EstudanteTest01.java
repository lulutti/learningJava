package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luiza";
        estudante.idade = 24;
        estudante.sexo = 'F';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante); //imprime o endereço de memória, pois a variavél é uma referência a um objeto em memória
    }
}
