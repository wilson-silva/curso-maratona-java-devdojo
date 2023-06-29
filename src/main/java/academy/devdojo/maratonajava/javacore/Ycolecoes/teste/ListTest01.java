package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Willian");
        nomes.add("DevDojo Academy");
        nomes.add("Joao");
        nomes.add("Academy");
        nomes2.add("Silva");
        nomes2.add("Fran");

        System.out.println("Tamanho da lista nomes: " + nomes.size());
        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("------------------");
        System.out.println("Tamanho da lista nomes2: " + nomes2.size());
        nomes2.forEach(System.out::println);

        nomes.addAll(nomes2);

        nomes.remove(1);
        nomes.remove("Academy");

        System.out.println("------------------");
        System.out.println("Tamanho da lista nomes: " + nomes.size());
        nomes.forEach(System.out::println);

    }
}
