package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file,true)){
            fw.write("Olá mundo!");
            /* Substitui todo o conteúdo pré existente se não passar o parâmetro no file */
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
