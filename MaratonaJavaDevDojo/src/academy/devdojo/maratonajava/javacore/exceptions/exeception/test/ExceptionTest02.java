package academy.devdojo.maratonajava.javacore.exceptions.exeception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        //Checked exceptions - filhas diretas de Exceptions
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt"); // java.io.IOException: O sistema não pode encontrar o caminho especificado

        // As boas práticas dizem para tratar as execeptions mais especificas ao invés da mais genérica "Exception", pois assim você oferece um tratamento melhor
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) { // Nunca deixar o bloco catch em branco
            e.printStackTrace(); // Imprime tudo o que aconteceu
        }


    }
}
