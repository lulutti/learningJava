package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua Alexandre Martins");
        endereco1.setRua("1111111");

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua Pindorama");
        endereco2.setRua("1111111");

        Pessoa pessoa = new Pessoa("Helo");
        pessoa.setCpf("444444444");
        pessoa.setEndereco(endereco1);

        Funcionario funcionario = new Funcionario("Tadeu");
        funcionario.setCpf("3333333");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(2200);

        pessoa.imprime();
        funcionario.imprime();
    }
}
