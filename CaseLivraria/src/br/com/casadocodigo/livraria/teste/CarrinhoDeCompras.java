package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private double total;
    private List<Produto> produtos = new ArrayList<>();

    public CarrinhoDeCompras(){
        this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto){
        System.out.println("Adicionando: " + produto);
        this.produtos.add(produto);
    }

    public void remove(int posicao){
        this.produtos.remove(posicao);
    }

    public double getTotal(){
        return this.total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
