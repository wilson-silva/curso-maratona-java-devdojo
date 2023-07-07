package academy.devdojo.maratonajava.javacore.zzd_option.teste;

import academy.devdojo.maratonajava.javacore.zzd_option.dominio.Manga;
import academy.devdojo.maratonajava.javacore.zzd_option.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.searchMangaByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaId = MangaRepository.searchMangaById(2)
                .orElseThrow(IllegalAccessError::new);
        System.out.println(mangaId);

        Manga newManaga = MangaRepository.searchMangaByTitle("Drifters")
                .orElse(new Manga(3, "Drifters", 20));
        System.out.println(newManaga);


    }
}
