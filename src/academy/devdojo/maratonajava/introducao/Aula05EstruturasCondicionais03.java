package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Doar se salario > 5000

        System.out.print("Informe o salário: ");
        double salario = scan.nextDouble();
        //(condicao) ? verdadeiro : falso;
        String resultado = (salario > 5000) ? "Eu vou doar 500 para o DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
