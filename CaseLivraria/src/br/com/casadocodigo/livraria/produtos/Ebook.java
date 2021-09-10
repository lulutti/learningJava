package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class Ebook extends Livro implements Promocional {

    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }
        return aplicaDescontoDe(porcentagem);
    }

    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }

    public String getWaterMark(){
        return this.waterMark;
    }
}
