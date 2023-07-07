package academy.devdojo.maratonajava.javacore.zzd_option.repositorio;

import academy.devdojo.maratonajava.javacore.zzd_option.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    public static List<Manga>  mangas = List.of(
            new Manga(1, "Boku no hero", 50),
            new Manga(2, "Overlord", 25));
    //------------------------------------------------------------

    public static Optional<Manga> searchMangaById(Integer id){
        return findBy(i -> i.getId().equals(id));
    }

    public static Optional<Manga> searchMangaByTitle(String title){
        return findBy(i -> i.getTitle().equals(title));
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if(predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }





}
