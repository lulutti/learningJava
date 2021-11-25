package academy.devdojo.maratonajava.javacore.io.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file,true)){
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Olá mundo!");
            /* Substitui todo o conteúdo pré existente se não passar o parâmetro no file */
            bw.newLine();
            bw.write("hahahah");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
