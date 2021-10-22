package academy.devdojo.maratonajava.introducao.condicionais;

public class SwitchExercicio {

    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana

        byte day = 7;

        switch(day){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
            case 1:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Invalid");
        }
    }

};
