package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.domain.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // Processo de instância de um objeto com herança
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
        // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
        // 2 - Alocado espaço em memória para o objeto da classe pai
        // 3 - Cada atributo da superclasse é criado e inicilizado com valores default ou com o valor que foi passado
        // 4 - Bloco de inicializçaão da superclasse é executado na ordem em que aparece
        // 5 - Construtor da superclasse é executado
        // 6 - Alocado espaço em memória para o objeto da classe filha
        // 7 - Cada atributo da classe filha é criado e inicilizado com valores default ou com o valor que foi passado
        // 8 - Bloco de inicializçaão da classe filha é executado na ordem em que aparece
        // 9 - Construtor da classe filha é executado


        // Bloco de inicialização de instância - executado todas as vezes que se cria um objeto, é executado independente do construtor que for utilizado
        Funcionario funcionario = new Funcionario("Tadeu");
    }
}
