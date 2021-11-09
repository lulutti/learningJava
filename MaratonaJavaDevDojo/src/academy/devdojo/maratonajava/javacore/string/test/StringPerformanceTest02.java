package academy.devdojo.maratonajava.javacore.string.test;

public class StringPerformanceTest02 {
    public static void main(String[] args) {
        // Melhora da performance com StringBuilder
        long start = System.currentTimeMillis();

        concatStringBuilder(100000);

        long end = System.currentTimeMillis();

        System.out.println("Tempo gasto para String " + (end - start) + "ms");

        // 24ms
    }


    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho ; i++) {
            sb.append(i);
        }
    }
}
