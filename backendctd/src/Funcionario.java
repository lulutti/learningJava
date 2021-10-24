import java.util.Calendar;

public class Funcionario extends Vendedor {

    private int anoContracao;

    public Funcionario(String nome, int anoContracao) {
        this.nome = nome;
        this.anoContracao = anoContracao;
    }

    public int getAnoContracao() {
        return anoContracao;
    }

    public void setAnoContracao(int anoContracao) {
        this.anoContracao = anoContracao;
    }

    public String pontuacaoFidelidade() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int tempoFidelidade = year - this.anoContracao;
        if (tempoFidelidade >= 5) {
            this.pontos += 5 * tempoFidelidade;
            return "Pontos de fidelidade adicionados";
        } else {
            return "Funcionário não possui tempo de antiguidade superior a 5 anos";
        }
    }

    public String obterAfiliado() {
        this.pontos += 10;
        return getPontos();
    }

    @Override
    public String vender() {
        this.pontos += 5;
        return getPontos();
    }
}
