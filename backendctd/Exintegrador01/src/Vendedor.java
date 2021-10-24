public abstract class Vendedor {
    protected String nome;
    protected int pontos;
    protected String categoria;
    public abstract String vender();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPontos() {
        return "Pontuação total: " + this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String mostrarCategoria() {
        String categoria = calcularPontos();
        setCategoria(categoria);
        return "Vendedor: " + getNome() + "\n" + getPontos() + "\n" + "Categoria: " + getCategoria();
    }

    public String calcularPontos(){
        if(this.pontos < 20){
            return "Novato";
        } else if(this.pontos >= 20 && this.pontos <= 30) {
            return "Aprendiz";
        } else if(this.pontos >= 31 && this.pontos <= 40){
            return "Bom";
        } else if(this.pontos > 40){
            return "Mestre";
        } else {
            return null;
        }
    }

}
