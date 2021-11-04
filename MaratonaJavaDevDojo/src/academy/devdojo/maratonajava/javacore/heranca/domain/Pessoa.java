package academy.devdojo.maratonajava.javacore.heranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estatico de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de psssoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de psssoa 2");
    }
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("**************************");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + endereco.getRua() + " " + endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
