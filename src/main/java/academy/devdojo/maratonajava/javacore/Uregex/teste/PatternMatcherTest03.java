package academy.devdojo.maratonajava.javacore.Uregex.teste;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, -
        // \W = Tudo que não for incluso no w
        // [] -> range

        String regex = "0[xX][0-9a-fA-F]";
        String texto2 = "12 0x 0X 0xffabc 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Posições encontradas");

        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }

        int numeroHex = 0X59F86A;
        System.out.println(numeroHex);

    }
}
