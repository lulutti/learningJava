package academy.devdojo.maratonajava.introducao.operadores;

public class Relacionais {
    public static void main(String[] args) {
        // retornam verdadeiro ou falso
        // são operadores de comparação de tipos iguais
        // < > menor ou maior
        // <= >= menor ou igual & maior ou igual
        // == igual
        // != diferente

        boolean isCemMaiorQueDez = 10 < 100;
        boolean isCemMenorQueDez = 10 > 100;
        boolean isCemIgualDez = 10 == 100;
        boolean isCemDiferenteDez = 10 != 100;

        System.out.println(isCemMaiorQueDez);
        System.out.println(isCemMenorQueDez);
        System.out.println(isCemIgualDez);
        System.out.println(isCemDiferenteDez);

    }
}
