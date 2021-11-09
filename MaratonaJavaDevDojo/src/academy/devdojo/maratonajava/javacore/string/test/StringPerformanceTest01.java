package academy.devdojo.maratonajava.javacore.string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        concatString(100000);

        long end = System.currentTimeMillis();

        System.out.println("Tempo gasto para String " + (end - start) + "ms");

        // 14655ms
    }

    private static void concatString(int tamanho){
        String texto = "";

        for (int i = 0; i < tamanho ; i++) {
            texto += i;
        }
    }
}
