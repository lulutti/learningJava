package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Strings são imutáveis
        String nome = "Luiza"; // String constant pool
        String nome2 = "Luiza";

        nome.concat(" dragonetti"); // Não altera a string original, por causa do conceito de imutabilidade, aqui eu apenas criei uma string no pool com " dragonetti", mas sem uma variável de referência pra ela
        String nomeCompleto = nome.concat(" dragonetti"); // Aqui foi criada uma nova variável com referência a uma string "luiza dragonetti", sem alterar "nome"
        System.out.println(nomeCompleto); // Luiza Dragonetti

        // Comparando se os dois objetos fazem referência a "Luiza" dentro da string pool
        System.out.println(nome == nome2); // True

        String nome3 = new String("Luiza"); // Aqui estou criando uma variavel que faz referência a um objeto que faz referência ao Luiza que está dentro do string pool // quase nunca utilizado

        System.out.println(nome == nome3); // falso, pois nome3 não faz referência direta ao string pool e aqui estamos comparando o local da memória

        System.out.println(nome2 == nome3.intern()); // true, pois os valores internos são iguais:  "Luiza"
    }

}
