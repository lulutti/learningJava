package academy.devdojo.maratonajava.introducao.strings;

public class strings {
    public static void main(String[] args) {
        // String é uma classe

        String firstName = "luiza";
        String lastName = "dragonetti";

        StringBuilder nomeCompleto = new StringBuilder();

        nomeCompleto.append(firstName).append("").append(lastName);

        System.out.println(nomeCompleto);
    }
}
