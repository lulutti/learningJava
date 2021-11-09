package academy.devdojo.maratonajava.javacore.exceptions.runtime.test;

public class RuntimeExceptionTest01 {
    // Checked - filhas diretas de Exception, apresentam a exceção antes mesmo de compilar
    // Unchecked - neta de Exception, filhas de RuntimeException - são lançadas durante a execução do programa
    public static void main(String[] args) {

        // NullPointerException
        Object object = null;
        System.out.println(object.toString());

        // ArrayIndexOutOfBoundsException
        int[] nums = {1,2};
        System.out.println(nums[2]);

    }

}
