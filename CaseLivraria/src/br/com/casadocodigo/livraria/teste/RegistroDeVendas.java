package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.teste.CarrinhoDeCompras;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        Livro livro = new LivroFisico(null);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total " + carrinho.getTotal());


        Produto[] produtos = carrinho.getProdutos();
        for (int i = 0; i <= produtos.length; i++) {
            try {
                Produto produto = produtos[i];
                if (produto != null) {
                    System.out.println(produto.getValor());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("deu exception no indice: " + i);
                e.printStackTrace();
            } catch (NullPointerException e){
                System.out.println("A array não foi instanciada!");
            }
        }
        System.out.println("Fui executado");
    }
}
