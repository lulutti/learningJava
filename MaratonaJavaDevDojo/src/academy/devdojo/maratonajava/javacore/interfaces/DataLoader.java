package academy.devdojo.maratonajava.javacore.interfaces;

public interface DataLoader {
    // Aqui ele aponta redundância, pois todos os atributos em uma interface são públicos, estáticos e constantes
    public static final int MAX_DATA_SIZ = 10;
    public abstract void load();

    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    // Não é possíel sobrescrever métodos estáticos
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
