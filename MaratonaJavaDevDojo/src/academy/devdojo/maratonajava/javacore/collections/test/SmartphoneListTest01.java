package academy.devdojo.maratonajava.javacore.collections.test;

import academy.devdojo.maratonajava.javacore.collections.test.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("23BAC","LG");
        Smartphone s2 = new Smartphone("988AC","SAMSUNG");
        Smartphone s3 = new Smartphone("123AA","APPLE");


        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("123AA","APPLE");
        System.out.println(smartphones.contains(s4)); // o containes executa o equals

        smartphones.add(0,s4);
        System.out.println(smartphones.indexOf(s4));

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        
        smartphones.clear(); // limpa
    }
}
