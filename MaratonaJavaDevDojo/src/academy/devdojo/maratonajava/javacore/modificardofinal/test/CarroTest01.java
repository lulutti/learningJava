package academy.devdojo.maratonajava.javacore.modificardofinal.test;

import academy.devdojo.maratonajava.javacore.modificardofinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.modificardofinal.domain.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("lulu");
        carro.setNome("QQ");
        System.out.println(carro.COMPRADOR);

        carro.imprime();
    }
}
