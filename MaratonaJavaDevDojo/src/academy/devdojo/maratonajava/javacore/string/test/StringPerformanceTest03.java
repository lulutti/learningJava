package academy.devdojo.maratonajava.javacore.string.test;

public class StringPerformanceTest03 {
    public static void main(String[] args) {
        // Melhora da performance com StringBuffer
        long start = System.currentTimeMillis();

        concatStringBuffer(100000);

        long end = System.currentTimeMillis();

        System.out.println("Tempo gasto para String " + (end - start) + "ms");

        // 22ms
    }


    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho ; i++) {
            sb.append(i);
        }
    }
}
