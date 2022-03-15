package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] dias  = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 25;
        dias[1][1] = 26;
        dias[1][2] = 27;

        dias[2][0] = 15;
        dias[2][1] = 17;
        dias[2][2] = 18;

        for(int i = 0; i < dias.length; i++){
           for (int j = 0; j <dias[i].length; j++ ){
               System.out.print(" " + dias[i][j]);
           }
            System.out.println();
        }

        System.out.println("------------------------------");
        for (int [] arrBase : dias) {
            for ( int num : arrBase) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}
