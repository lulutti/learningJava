package academy.devdojo.maratonajava.javacore.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/luiza");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);


        Path absoluto = Paths.get("/home/luiza");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");
        System.out.println(absoluto.resolve(relativo));
        System.out.println(absoluto.resolve(file));
        System.out.println(relativo.resolve(absoluto));
        System.out.println(relativo.resolve(file));


    }
}
