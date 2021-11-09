package academy.devdojo.maratonajava.javacore.exceptions.exeception.test;

import academy.devdojo.maratonajava.javacore.exceptions.exeception.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.exceptions.exeception.domain.Leitor2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest02 {
    public static void main(String[] args) {
        lerArquivo(); // fecha na ordem inversa
    }

    public static void lerArquivo() {
        // funciona apenas para classes que implementam a interface closeable ou autocloseable
        // Ele instancia e depois executa o reader.close quando terminar de utilizar
        try (Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
