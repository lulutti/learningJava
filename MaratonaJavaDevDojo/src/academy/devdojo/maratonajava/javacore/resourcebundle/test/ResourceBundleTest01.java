package academy.devdojo.maratonajava.javacore.resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    // Uma forma de pegar uma mensagem baseada no local

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        boolean isExistBundle = bundle.containsKey("hello");
        System.out.println(isExistBundle);

        System.out.println(bundle.getString("hello"));

        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(bundle.getString("hello"));


    }
}
