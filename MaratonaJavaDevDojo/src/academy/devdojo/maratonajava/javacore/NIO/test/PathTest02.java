package academy.devdojo.maratonajava.javacore.NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta"); // new File pasta

        if(Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);
        } else {
            System.out.println("Pasta já existe");
        }
        Path subPastaPath = Paths.get("pasta/pasta2/pasta3");
        Path subPastaDirectory = Files.createDirectory(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");

        if(Files.notExists(filePath)){

            Path filePatchCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
