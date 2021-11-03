package academy.devdojo.maratonajava.javacore.blocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.blocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Erased");

        for(int epsodio : anime.getEpsodios()){
            System.out.print(epsodio + " ");
        }

    }
}
