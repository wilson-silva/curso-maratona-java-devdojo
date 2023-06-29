package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 1;
        while(count <= 10) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        count = 0;
        do{
            System.out.print(++count + " ");
        }while(count < 10);
        System.out.println();

        for(int i=1; i <=10; i++){
            System.out.print(i + " ");
        }
    }
}
