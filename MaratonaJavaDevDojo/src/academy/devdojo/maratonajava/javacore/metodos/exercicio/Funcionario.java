package academy.devdojo.maratonajava.javacore.metodos.exercicio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public Funcionario(String nome, int idade, double... salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salarios: ");
        for (double salario : salarios) {
            System.out.println(salario);
        }
        mediaSalarial();
    }

    public void mediaSalarial() {
        double somaSalarios = 0;
        for (double salario : salarios) {
            somaSalarios += salario;
        }
        double media = somaSalarios / salarios.length;
        System.out.println("Media SalariaL: " + media);
    }
}
