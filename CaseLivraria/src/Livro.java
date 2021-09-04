public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        this();
        this.autor = autor;
        System.out.println("novo livro criado");
    }

    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    void mostrarDetalhes(){
        String mensagem = "Mostrando detalhes do livro: " + this.nome;
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);

        if(this.temAutor()){
            autor.mostrarDetalhes();
        }

        System.out.println("Valor: " + this.getValor());
        System.out.println("ISBN :" + isbn);
        System.out.println("--");


    };

    public boolean aplicaDescontoDe(double porcentagemDesconto){
        if(porcentagemDesconto > 0.3){
            return false;
        }
        this.valor -= this.valor * porcentagemDesconto;
        return true;
    }

    boolean temAutor(){
        return this.autor != null;
    }
}

