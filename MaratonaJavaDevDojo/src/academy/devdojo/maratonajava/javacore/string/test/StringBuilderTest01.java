package academy.devdojo.maratonajava.javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Luiza Dragonetti";
        nome.concat(" Dev Java");
        System.out.println(nome); // Luiza Dragonetti

        StringBuilder sb = new StringBuilder("Luiza Dragonetti"); // Não é imutável
        sb.append("-> Dev Java");

        System.out.println(sb); // Luiza Dragonetti Dev Java

        sb.append(" Angular").append(" TS").append(" Git");
        System.out.println(sb);

        sb.substring(0,2); // Não manipula a string original, pois esse método retorna uma nova string

        sb.reverse(); // manipula a string original, invertando sua ordem
        sb.delete(0,4); // manipula a string original
        sb.reverse();
        System.out.println(sb);
    }
}
