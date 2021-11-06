package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MAC10", 11000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 2500);

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tv);



    }
}
