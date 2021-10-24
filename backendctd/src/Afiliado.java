public class Afiliado extends Vendedor{

    public Afiliado(String nome) {
        this.nome = nome;
    }

    @Override
    public String vender() {
        this.pontos += 15;
        return getPontos();
    }
}
