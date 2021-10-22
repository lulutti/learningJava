package academy.devdojo.maratonajava.introducao.repeticao;

public class Continue{
    public static void main(String[] args) {
        // Dado o valor de um carro, descbra em quantas vezes ele pode ser parcelado
        // Condição = valorParcela >= 1000;

        double valorCarro = 89000;

        for(int parcela = (int)valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }

            System.out.println("Parcelas " + parcela + "R$ " + valorParcela);
        }

    }
}
