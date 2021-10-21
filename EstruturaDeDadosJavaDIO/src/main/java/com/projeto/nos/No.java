package com.projeto.nos;

public class No<T>{
    private T livro;
    private No<T> proximoNo = null;

    public No(T livro) {
        this.livro = (T) livro;
    }

    public T getLivro() {
        return livro;
    }

    public void setLivro(T livro) {
        this.livro = livro;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "livro='" + livro + '\'' +
                '}';
    }
}
