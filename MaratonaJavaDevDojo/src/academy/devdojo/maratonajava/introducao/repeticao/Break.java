package academy.devdojo.maratonajava.introducao.repeticao;

public class Break {

    public static void main(String[] args) {
        // Imprimindo os primeiros 25 números de um valor
        int i = 0;
        while(i < 200){
            i++;
            System.out.println(i);
            if(i == 25) break;
        }
        // Breaks funcionam apenas dentro de estruturas de laço de repetição ou switch
    }

}
