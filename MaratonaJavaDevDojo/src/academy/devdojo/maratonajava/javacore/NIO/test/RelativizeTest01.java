package academy.devdojo.maratonajava.javacore.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/luiza");
        Path project = Paths.get("home/luiza/devdojo/texto.txt");

        Path pathToProject = dir.relativize(project);
        System.out.println(pathToProject);

    }
}
