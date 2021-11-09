package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        // Métodos
        String nome = "Luiza";

        // charAt - exibe a letra correspondente aos indices
        System.out.println(nome.charAt(4)); // a

        // lenght - nº de caracteres
        System.out.println(nome.length()); // 5

        // troca todas as letras x por y
        System.out.println(nome.replace("z","k")); // Luika
        // transforma em lowercase
        System.out.println(nome.toLowerCase()); // luiza

        // transforma em uppercase
        System.out.println(nome.toUpperCase()); // LUIZA

        // Retorna uma substring com o range passado
        // Primeiro valor - indice que começa
        // Segundo valor - o valor de corte -1
        System.out.println(nome.substring(0,2)); // Lu

        // Remove os valores em branco do começo e do final
        nome = "    luiza      ";
        System.out.println(nome.trim()); // luiza

    }
}
