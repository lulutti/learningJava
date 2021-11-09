package academy.devdojo.maratonajava.javacore.wrapper.test;

public class WrapperTest01 {

    public static void main(String[] args) {
        // Classes que instanciam objetos que encapsulam os tipos primitivos

        //Todas essas classes extends Number
        Byte byteA = 1;
        Short shortA = 1;
        Integer intA = 1;// Autoboxing
        Long longA = 1L;
        Float floatA = 1F;
        Double doubleA = 1.0;
        Character charA = 'a';
        Boolean booleanA = true;

        // Unboxing
        int i = intA; // unboxing do objeto intA

        Integer intB = Integer.parseInt("1"); // Os wrappers disponibilizam diversos métodos, esse por exemplo transforma uma string em um Integer

        Boolean isTrue = Boolean.parseBoolean("true"); // case-insensitive
        System.out.println(isTrue);

        System.out.println(Character.isDigit('A')); // diz se é um digito ou não
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('8')); // diz se o digito corresponde a uma letra ou digito
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('B'));
    }
}
