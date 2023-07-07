package academy.devdojo.maratonajava.javacore.y_colecoes.teste;

import academy.devdojo.maratonajava.javacore.y_colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Berserk");
        mangas.add("Attack on titan");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        mangas.forEach(System.out::println);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        Collections.sort(dinheiros);
        System.out.println("--------------------");
        dinheiros.forEach(System.out::println);

        new Manga(1L, null, 3.3);


    }
}
