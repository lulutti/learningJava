package academy.devdojo.maratonajava.introducao.repeticao;

public class ForExercicio {
    public static void main(String[] args) {
        // Imprimindo todos os números pares de 0 até 1000000
        for(int i = 0; i <= 1000000; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
