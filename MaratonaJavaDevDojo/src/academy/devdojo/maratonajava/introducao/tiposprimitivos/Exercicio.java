package academy.devdojo.maratonajava.introducao.tiposprimitivos;
/* Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, moro na cidade <cidadade>,
confirmo que recebi o salário de <salario>, na data <data>
*/

public class Exercicio {
    public static void main(String[] args) {
        String nome = "Jorge";
        String cidade = "Guarujá";
        double salario = 2500.00;
        String dataRecebimento = "21/10/2021";

        // Modo de concatenação com +
        System.out.println("\nConcatenando");
        System.out.println("Eu "+nome+" residente de "+cidade+", confirmo que recebi o salário de "+salario+" na data "+dataRecebimento);

        // Utilizando a classe StringBuilder
        StringBuilder visto = new StringBuilder();
            visto.append("Eu ");
            visto.append(nome);
            visto.append(" residente de ");
            visto.append(cidade);
            visto.append(", confirmo que recebi o salário de ");
            visto.append(salario);
            visto.append(" na data ");
            visto.append(dataRecebimento);

        System.out.println("\nStringBuilder");
        System.out.println(visto);

    }







}
