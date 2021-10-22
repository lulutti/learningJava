package academy.devdojo.maratonajava.introducao.condicionais;

public class IfTernary {
    public static void main(String[] args) {
        boolean likeCake = true;

        String show = "Show available cakes";
        String notShow = "Show others foods";
        // (condição) ? verdadeiro : falso
        String showItens = likeCake ? show : notShow;

        System.out.println(showItens);

    }
}
