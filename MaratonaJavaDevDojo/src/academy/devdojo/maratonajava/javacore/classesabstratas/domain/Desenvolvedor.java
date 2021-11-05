package academy.devdojo.maratonajava.javacore.classesabstratas.domain;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void caculaBonus() {
        this.salario += this.salario * 0.05;
    }

}
