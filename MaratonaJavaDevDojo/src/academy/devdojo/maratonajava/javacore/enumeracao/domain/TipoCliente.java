package academy.devdojo.maratonajava.javacore.enumeracao.domain;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"),
    PESSOA_JURIDICA(2,"Pessoa Juridica");

    public final int VALOR;
    public final String nomeRelatorio;

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRel){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.nomeRelatorio.equals(nomeRel)) {
                return tipoCliente;
            }
        }
        return null;

    }

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

}
