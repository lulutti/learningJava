package academy.devdojo.maratonajava.javacore.classesabstratas.domain;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        caculaBonus();
    }

    public abstract void caculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
