package academy.devdojo.maratonajava.javacore.enumeracao.test;

import academy.devdojo.maratonajava.javacore.enumeracao.domain.Cliente;
import academy.devdojo.maratonajava.javacore.enumeracao.domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.enumeracao.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marisa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Leo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("***************************");

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");

        System.out.println(tipoCliente2);

    }
}
