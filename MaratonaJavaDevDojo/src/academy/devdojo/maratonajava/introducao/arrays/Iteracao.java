package academy.devdojo.maratonajava.introducao.arrays;

public class Iteracao {
    public static void main(String[] args) {
        String [] countries = new String[8];

        countries[0] = "Brasil";
        countries[1] = "Argentina";
        countries[2] = "Chile";
        countries[3] = "Peru";
        countries[4] = "Venezuela";
        countries[5] = "Bolivia";
        countries[6] = "Colombia";
        countries[7] = "Uruguai";

        // Com for
        for(int i = 0; i < countries.length; i++){
            System.out.println(countries[i]);
        }

        // ForEach
        for(String country : countries){
            System.out.println(country);
        }

    }


}
