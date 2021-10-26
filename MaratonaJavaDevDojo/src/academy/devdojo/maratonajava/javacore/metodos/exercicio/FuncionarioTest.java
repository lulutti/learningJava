package academy.devdojo.maratonajava.javacore.metodos.test;

import academy.devdojo.maratonajava.javacore.metodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jorge",45,1200,1330,680);
        funcionario.imprime();
        funcionario.mediaSalarial();
    }
}
