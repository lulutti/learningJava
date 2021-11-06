package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",3000);
        Produto produto2 = new Tomate("Comum",5);

    }
}
