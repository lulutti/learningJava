package academy.devdojo.maratonajava.javacore.NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    // Interface que substitui File
    // Paths (class) > Path (interfaces) > Files (class) (acesso aos métodos)
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\ludra\\IdeaProjects\\learningJava\\MaratonaJavaDevDojo\\file.txt");
        Path p2 = Paths.get("C:\\Users\\ludra\\IdeaProjects\\learningJava\\MaratonaJavaDevDojo","file.txt");
        Path p3 = Paths.get("C","\\Users\\ludra\\IdeaProjects\\learningJava\\MaratonaJavaDevDojo","file.txt");
        Path p4 = Paths.get("C","Users","ludra","IdeaProjects","learningJava","MaratonaJavaDevDojo","file.txt");


        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());

    }


}
