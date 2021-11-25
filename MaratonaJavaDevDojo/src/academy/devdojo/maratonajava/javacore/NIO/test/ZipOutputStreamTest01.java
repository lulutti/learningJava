package academy.devdojo.maratonajava.javacore.NIO.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivozip = Paths.get("pasta/arquivo.zip");
        Path pastaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivozip, pastaZipar);
    }

    private static void zip(Path arquivozip, Path pastaZipar){
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivozip)); DirectoryStream<Path> directoryStream = Files.newDirectoryStream(pastaZipar)){
            for(Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
                System.out.println("Arquivo zipado com sucesso!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
