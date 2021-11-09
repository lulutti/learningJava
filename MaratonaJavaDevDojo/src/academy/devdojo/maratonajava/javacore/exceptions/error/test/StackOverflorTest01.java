package academy.devdojo.maratonajava.javacore.exceptions.test;

public class StackOverflorTest01 {
    public static void main(String[] args) {
        recursividade();
        // Exception in thread "main" java.lang.StackOverflowError
    }

    public static void recursividade(){
        recursividade();
    }
}
