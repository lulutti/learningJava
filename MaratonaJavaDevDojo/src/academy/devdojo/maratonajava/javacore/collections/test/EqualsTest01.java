package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.test.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        // equals compara o valor da string
        // é case sensitive
        String nome1 = "Luiza";
        String nome2 = "Luiza";

        System.out.println(nome1.equals(nome2));


        // testando com instâncias
        // em instâncias ela n verifica o conteúdo e sim o local de memória

        Smartphone s1 = new Smartphone("23BAC","LG");
        Smartphone s2 = new Smartphone("23BAC","LG");

        System.out.println(s1.equals(s2));
    }
}
