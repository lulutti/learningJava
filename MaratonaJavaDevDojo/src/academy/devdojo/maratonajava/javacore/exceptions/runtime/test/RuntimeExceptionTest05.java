package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

public class RuntimeExceptionTest04 {
    // Capturando múltiplas execeptions - multi catch
    public static void main(String[] args) {
        try {
            throw  new ArithmeticException(); // O java ira procurar a exception que mais se adequa nos catchs
            // Se você não tiver o catch correto o erro vai parar o programa, o correto é adicionar um catch com RuntimeException para pegar qualquer outra exception que não está recebendo tratamento, mas ela precisa estar como o último catch
            // exceptions mais genéricas precisam ficar no final
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do ArithmeticException");
        }
    }
}
