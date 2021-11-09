package academy.devdojo.maratonajava.javacore.exceptions.exeception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    // Quando se sobrescreve uma método que contém exeception temos algumas regras:
    // 1- Você pode não lançar nenhuma exception
    // 2- Você pode lançar todas as que tem na superclasse
    // 3- Você pode adicionar quaisquer outras execeptions unchecked
    // 4- Você NÃO pode adicionar exceptions mais genéricas ou do tipo checked
    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvando funcionário");
    }
}
