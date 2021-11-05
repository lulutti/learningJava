package academy.devdojo.maratonajava.javacore.classesabstratas.test;

import academy.devdojo.maratonajava.javacore.classesabstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.classesabstratas.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.classesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Hugo",12000);
        System.out.println(gerente);
        desenvolvedor.imprime();
    }
}
