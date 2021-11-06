package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.polimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();

        repositorio.salvar();
    }
}
