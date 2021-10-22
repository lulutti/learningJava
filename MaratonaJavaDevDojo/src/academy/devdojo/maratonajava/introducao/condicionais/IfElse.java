package academy.devdojo.maratonajava.introducao.condicionais;

public class IfElse {
    public static void main(String[] args) {

        int age = 15;
        boolean isLegalDrink = age >= 21;

        if(isLegalDrink) {
            System.out.println("You can buy drinks");
        } else {
            System.out.println("You can't buy drinks");
        }

        System.out.println("\n");

        int myAge = 17;
        String movie;

        System.out.println("Age-recommended weekend movie:");

        if(myAge < 12){
            movie = "\tCruella";
        } else if (myAge < 16){
            movie = "\tVenon: let there be carnage";
        } else if (myAge < 18){
            movie = "\tVenon: let there be carnage";
        } else {
            movie = "\tFree Guy";
        }

        System.out.println(movie);






    }
}
