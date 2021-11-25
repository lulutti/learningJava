package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {

        // Instancia File e define o nome e o caminho do novo arquivo
        File file = new File("file.txt");

        // De fato cria um novo arquivo, precisa de try/catch

        try {
            boolean exists = file.exists(); // Verifica se o arquivo existe, retorna true pra sim e false pra não
            if (exists) {
                boolean isDeleted = file.delete(); // Deleta  arquivo
                System.out.println("Deletou? " + isDeleted);
            }
            boolean isCreated = file.createNewFile(); // Cria um arquivo, não sobrescreve
            System.out.println("Criou? " + isCreated);

            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modified " + new Date(file.lastModified()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
