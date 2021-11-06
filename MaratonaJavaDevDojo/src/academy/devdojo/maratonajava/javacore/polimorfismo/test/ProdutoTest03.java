package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",3000);
        Tomate tomate = new Tomate("Comum",5);

        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(produto);
        CalculadoraImposto.calcularImposto(tomate);

    }
}
