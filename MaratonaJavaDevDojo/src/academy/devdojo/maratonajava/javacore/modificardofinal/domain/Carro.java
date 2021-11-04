package academy.devdojo.maratonajava.javacore.modificardofinal.domain;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    public static final double VELOCIDADE_LIMITE = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public final void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprador: " + COMPRADOR.getNome());
    }
}
