package academy.devdojo.maratonajava.javacore.q_string.teste;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat("DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        System.out.println();

        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
