package academy.devdojo.maratonajava.javacore.heranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    static {
        System.out.println("Dentro do bloco estatico de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário de  " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
