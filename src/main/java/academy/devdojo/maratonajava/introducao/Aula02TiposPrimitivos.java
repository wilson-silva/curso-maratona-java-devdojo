package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 30;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Wilson";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char: " + caractere);
        System.out.println("Oi meu nome é " + nome);

    }
}
