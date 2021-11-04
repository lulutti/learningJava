package academy.devdojo.maratonajava.javacore.sobreescrita.test;

import academy.devdojo.maratonajava.javacore.sobreescrita.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dr. Stone");

        System.out.println(anime); // A variavél de referência dentro do systemout sempre irá chamar o toString()
    }
}
