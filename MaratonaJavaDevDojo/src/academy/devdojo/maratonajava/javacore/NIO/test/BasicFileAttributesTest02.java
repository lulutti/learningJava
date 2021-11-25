package academy.devdojo.maratonajava.javacore.NIO.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/novo.txt");
        Files.createFile(path);
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAcessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println(creationTime);
        System.out.println(lastAcessTime);
        System.out.println(lastModifiedTime);


        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class
        );

        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,newCreationTime,creationTime);

     creationTime = basicFileAttributes.creationTime();
     lastAcessTime = basicFileAttributes.lastAccessTime();
     lastModifiedTime = basicFileAttributes.lastModifiedTime();

        System.out.println("______________");
        System.out.println(creationTime);
        System.out.println(lastAcessTime);
        System.out.println(lastModifiedTime);



    }
}
