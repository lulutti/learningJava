package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    // Capturando múltiplas execeptions - multi catch - na mesma linha
    public static void main(String[] args) {
        // Quando o método pode retornar vários catchs, mas que não são da mesma linha de herança

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
