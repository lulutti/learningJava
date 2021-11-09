package academy.devdojo.maratonajava.javacore.exceptions.exeception.domain;

public class LoginInvalidoException extends Exception{
    // Exception personalizada


    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
