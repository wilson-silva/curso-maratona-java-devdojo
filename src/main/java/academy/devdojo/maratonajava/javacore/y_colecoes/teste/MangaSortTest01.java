package academy.devdojo.maratonajava.javacore.y_colecoes.teste;

import academy.devdojo.maratonajava.javacore.y_colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L, "Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokemon", 3.2));
        mangas.add(new Manga(3L, "Attack on titan", 11.20));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

        mangas.forEach(System.out::println);

        System.out.println("-----------------------");
        Collections.sort(mangas);
        mangas.forEach(System.out::println);

        System.out.println("-----------------------");
        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        mangas.forEach(System.out::println);
    }
}
