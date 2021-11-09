package academy.devdojo.maratonajava.javacore.exceptions.exeception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        //Checked exceptions - filhas diretas de Exceptions
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt"); // java.io.IOException: O sistema não pode encontrar o caminho especificado

        // Lançando exception checked
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) { // Nunca deixar o bloco catch em branco
            e.printStackTrace(); // Imprime tudo o que aconteceu
            throw  e; // Apesar de ter tratado a exception, aqui estamos lançando ela novamente para quem chamou o método, isso só faz sentido em método públicos
        }


    }
}
