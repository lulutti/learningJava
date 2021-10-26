package academy.devdojo.maratonajava.javacore.metodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salarios;

    public Funcionario(String nome, int idade, int... salarios) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salarios;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salarios: ");
        for(int salario : salarios){
            System.out.println(salario);
        }
    }

    public void mediaSalarial(){
        int somaSalarios = 0;
        for(int salario : salarios){
            somaSalarios += salario;
        }
        double media = somaSalarios / salarios.length;
        System.out.println("Media SalariaL: " + media);
    }
}
