package academy.devdojo.maratonajava.javacore.u_regex.teste;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos, -
        // \W = Tudo que não for incluso no w
        // [] -> range
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xffabc 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }
    }
}
