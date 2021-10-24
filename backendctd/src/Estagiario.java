public class Estagiario extends Vendedor{

    public Estagiario(String nome) {
        this.nome = nome;
    }

    @Override
    public String vender() {
        this.pontos += 5;
        return getPontos();
    }

    @Override
    public String calcularPontos(){
        if(this.pontos < 50){
            return "Estagiário novato";
        } else {
            return "Estagiário experiente";
        }
    }
}
