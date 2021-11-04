package academy.devdojo.maratonajava.javacore.modificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] epsodios;
    // Processo de instância de um objeto até agora
    // 0- Bloco de inicialização é executado quando a JVM carregar a classe
    // 1- Alocado espaço em memória para o objeto
    // 2- Cada atributo de classe é criado e inicilizado com valores default ou com o valor que foi passado
    //3- Bloco de inicialização é executado
    //4- Construtor é executado

    // Bloco de inicialização de instância - executado todas as vezes que se cria um objeto, é executado independente do construtor que for utilizado
    static {
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++){
            epsodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }

}
