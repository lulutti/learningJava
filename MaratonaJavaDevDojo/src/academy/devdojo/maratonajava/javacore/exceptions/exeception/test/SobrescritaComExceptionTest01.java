package academy.devdojo.maratonajava.javacore.exceptions.exeception.test;

import academy.devdojo.maratonajava.javacore.exceptions.exeception.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.exceptions.exeception.domain.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.exceptions.exeception.domain.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
