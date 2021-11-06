package academy.devdojo.maratonajava.javacore.interfaces;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public
    // na hora de sobrescrever um método com default você pode definir que ele seja mais liberal com protected ou public, mas não private, pois não se pode deixar um método mais restritivo


    @Override
    public void load() {
        System.out.println("Carregando dados de um banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do bando de dados");
    }

    // Aqui não sobrescrevi o método da ‘interface’, criei um método com o mesmo nome, agora quando essa classe chamar esse método ela irá responder ao seu método e não ao da ‘interface’
    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe que implementou a interface");
    }
}
