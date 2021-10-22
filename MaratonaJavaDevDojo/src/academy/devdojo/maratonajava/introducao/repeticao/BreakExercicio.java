package academy.devdojo.maratonajava.introducao.repeticao;

public class BreakExercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro, descbra em quantas vezes ele pode ser parcelado
        // Condição = valorParcela >= 1000;

        double valorCarro = 89000;

        for(double parcela = 1; parcela <= valorCarro; parcela++ ){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }

            System.out.println("Parcelas " + parcela + "R$ " + valorParcela);
        }

    }
}
