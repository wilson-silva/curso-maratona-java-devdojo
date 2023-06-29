package academy.devdojo.maratonajava.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final
        // de semana considerando 1 como domingo.

        byte dia = scan.nextByte();
            switch (dia){
                case 1 :
                case 7 :
                    System.out.println("Final de semana");
                    break;
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                case 6 :
                    System.out.println("Dia útil");
                    break;
                default:
                    System.out.println("dia inválido!");

            }
    }
}
