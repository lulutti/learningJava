package academy.devdojo.maratonajava.javacore.polimorfismo.service;

import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    // Método genérico
    public static void calcularImposto(Produto produto){
        System.out.println("///////////////////////////////////////");
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);

        if(produto instanceof Tomate){

            System.out.println("Data de validade: " + ((Tomate) produto).getDataValidade());
        }
    }
}
