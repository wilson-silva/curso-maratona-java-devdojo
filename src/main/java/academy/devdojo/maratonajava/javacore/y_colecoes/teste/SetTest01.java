package academy.devdojo.maratonajava.javacore.y_colecoes.teste;

import academy.devdojo.maratonajava.javacore.y_colecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"ABerserk", 9.5));
        mangas.add(new Manga(4L,"Pokemon", 3.2));
        mangas.add(new Manga(3L,"Attack on titan", 11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99));
        mangas.add(new Manga(2L,"Dragon Ball Z", 2.99));

        mangas.forEach(System.out::println);
        System.out.println("-----------------------");

    }
}
