package academy.devdojo.maratonajava.javacore.polimorfismo.service;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivoMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando dados na Memoria");
    }
}
