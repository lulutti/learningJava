package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        System.out.println(abreConexao());

    }

    private static String abreConexao() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo arquivo");
            return "Conexão aberta";
        } catch(Exception e){
            e.printStackTrace();
        } finally { // O bloco finally será executado sempre
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
