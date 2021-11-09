package academy.devdojo.maratonajava.javacore.exceptions.exeception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }

    public static void lerArquivo() {
        // funciona apenas para classes que implementam a interface closeable ou autocloseable
        // Ele instancia e depois executa o reader.close quando terminar de utilizar
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {

        }
    }
}
