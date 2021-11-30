package academy.devdojo.maratonajava.javacore.collections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List nomes = new ArrayList(); // Versão 1.4 java
        nomes.add("luiza");
        nomes.add("kauã");
        nomes.add(455);
        nomes.remove(2);

        for(Object nome : nomes){
            System.out.println(nome);
        }

        List<String> sobrenomes = new ArrayList<>();
        sobrenomes.add("dragonetti");
        sobrenomes.add("cordeiro");

        for (String sobrenome : sobrenomes) {
            System.out.println(sobrenome);
        }

        System.out.println("----------------");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
    }
}
