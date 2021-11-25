package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();

        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        try {
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
            System.out.println(isFileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(isDiretorioCriado);

        File fileRenamed = new File(fileDiretorio,"arquivoa.txt");

        fileArquivoDiretorio.renameTo(fileRenamed);

    }


}
