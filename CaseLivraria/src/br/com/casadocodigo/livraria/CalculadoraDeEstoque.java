package br.com.casadocodigo.livraria;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        // Para verificar o else if dos valores acima de 2000 vamos usar um looping

        double soma = 0;
        int contador = 0;

        while(contador < 35){
            double valorDoLivro = 59.90;
            soma += valorDoLivro;
            contador++;
        }

        // Também é possível realizar o mesmo procedimento utilizando for
        // double soma = 0;
        // for(double i = 0; i < 35; i++} {
        //      soma+= 59.90 }

        double livroJava8 = 59.90;
        double livroTDD = 59.90;

        System.out.println("O total em estoque é " + soma);

        if(soma < 150){
            System.out.println("Seu estoque está muito baixo!");
        } else if(soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom");
        };

        // Outra alternativa é usar os ternários, ambos funcionam, porém no ternário só é possível 1 true e 1 false.

        String estoque = soma < 150 ? "Seu estoque está muito baixo" : "Seu estoque está bom";
        System.out.println(estoque);


    }
}
