package academy.devdojo.maratonajava.javacore.classes.test;

import academy.devdojo.maratonajava.javacore.classes.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carroAntigo = new Carro();
        Carro carroNovo = new Carro();

        carroNovo.nome = "Meu carro novo";
        carroNovo.modelo = "Chery qq";
        carroNovo.ano = 2018;

        carroAntigo.nome = "Meu carro antigo";
        carroAntigo.modelo = "Gol";
        carroAntigo.ano = 2010;

        System.out.println("Nome: " + carroNovo.nome + "\n" + "Modelo: " + carroNovo.modelo + "\n" + "Ano: " + carroNovo.ano);

        System.out.println("//////////////////////");

        System.out.println("Nome: " + carroAntigo.nome + "\n" + "Modelo: " + carroAntigo.modelo + "\n" + "Ano: " + carroAntigo.ano);
    }
}
