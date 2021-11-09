package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

public class RuntimeExceptionTest02 {
    // Como lançar uma exceção unchecked
    public static void main(String[] args) {

        // Aqui no main irá tratar a exceção recebida do método divisão e o programa irá continuar
        try {
            divisao(5, 0);
        } catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Código finalizado");
    }

    // documentação do método e da exception
    /**
    *
    * @param a
    * @param b não pode ser zero
    * @return
    * @throws IllegalArgumentException caso b seja zero

     */

    private static int divisao(int a, int b) {
        //Aqui no método trata uma exception especifica
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não é possível dividir com 0");
        }

        return a / b;

    }
}
