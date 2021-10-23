package academy.devdojo.maratonajava.introducao.arrays;

public class Multidimensionais {
    public static void main(String[] args) {
        // Arrays dentro de arrays
        // O primeiro valor é a base - o mais externo

        int[][][] daysMonths = new int[12][1][];

        daysMonths[0][0] = new int[31];
        daysMonths[1][0] = new int[28];
        daysMonths[2][0] = new int[31];
        daysMonths[3][0] = new int[30];
        daysMonths[4][0] = new int[31];
        daysMonths[5][0] = new int[30];
        daysMonths[6][0] = new int[31];
        daysMonths[7][0] = new int[31];
        daysMonths[8][0] = new int[30];
        daysMonths[9][0] = new int[31];
        daysMonths[10][0] = new int[30];
        daysMonths[11][0] = new int[31];

        for (int[][] month : daysMonths) {
            System.out.println(month[0].length);
        }

    }

}
