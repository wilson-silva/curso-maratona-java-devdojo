package academy.devdojo.maratonajava.javacore.y_colecoes.teste;

import academy.devdojo.maratonajava.javacore.y_colecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(1L, "Berserk", 9.5, 5));
        mangas.add(new Manga(4L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(3L, "Attack on titan", 11.20, 2));
        mangas.add(new Manga(2L, "Dragon Ball Z", 2.99, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }
          mangas.removeIf(m -> m.getQuantidade() == 0);
          System.out.println(mangas);
    }
}
