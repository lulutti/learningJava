package academy.devdojo.maratonajava.introducao.operadores;

public class Logicos {
    public static void main(String[] args) {
        // && (AND) - x e y são z
        // || (OR) - x ou y são z
        // ! (NOT) - x não é z

        int age = 45;
        float salario = 3500f;
        boolean isLegalAbove30 = age > 30 && salario >=  4612;

        age = 26;
        salario = 3852f;
        boolean isLegalBelow30 = age < 30 && salario >= 3381;

        System.out.println("Is legal? " + isLegalAbove30);

        System.out.println("Is legal? " + isLegalBelow30);

        double balanceCC = 200;
        double balanceCP = 10000;
        float  newPhone = 2800;

        boolean canBuy = balanceCC >= newPhone|| balanceCP >= newPhone;

        System.out.println("I can buy? " + canBuy);


    }
}
