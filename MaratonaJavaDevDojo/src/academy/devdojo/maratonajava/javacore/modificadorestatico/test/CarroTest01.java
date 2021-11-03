package academy.devdojo.maratonajava.javacore.modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.modificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", 280);
        Carro carro2 = new Carro("BMW", 300);
        Carro carro3 = new Carro("Ferrari", 420);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
