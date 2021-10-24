

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Jorge",2014); // Criando objeto funcionario
        funcionario1.pontuacaoFidelidade(); // Acrescentando pontuação por antiguidade
        funcionario1.obterAfiliado(); // Acrescentando pontos
        funcionario1.vender(); // Acrescentando pontos
        System.out.println(funcionario1.mostrarCategoria()); // Mostrar categoria

        System.out.println("\n");

        Afiliado afiliado1 = new Afiliado("Rebeca");
        afiliado1.vender();
        afiliado1.vender();
        System.out.println(afiliado1.mostrarCategoria());

        System.out.println("\n");

        Estagiario estagiario01 = new Estagiario("Yasmim");
        estagiario01.vender();
        estagiario01.vender();
        System.out.println(estagiario01.mostrarCategoria());

    }
}
