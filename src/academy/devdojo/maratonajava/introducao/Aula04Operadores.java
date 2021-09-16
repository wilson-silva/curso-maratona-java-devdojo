package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        //Aritméticos
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        System.out.println("Subtração: " + (numero02 - numero01));
        System.out.println("Soma: " + (numero02 + numero01));
        System.out.println("Divisão: " + (numero02 / numero01));
        System.out.println("Multiplicação: " + (numero02 * numero01));
        System.out.println();

        // %
        int resto = 21 % 7;
        System.out.println(resto);
        System.out.println();

        //Relacionais
        // < >  <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);
        System.out.println();

        //Lógicos
        // && (AND), || (OR), !(NEGAÇÃO)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);
        System.out.println();

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel);
        System.out.println();

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
        System.out.println();

        // ++ --
        int contador = 0;
        contador += 1; //contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

        System.out.println();
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);



    }
}
