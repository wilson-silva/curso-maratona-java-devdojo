package academy.devdojo.maratonajava.javacore.zzc_lambdas.teste;


import academy.devdojo.maratonajava.javacore.zzc_lambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.zzc_lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 5),
                new Anime("One Piece", 100),
                new Anime("Naruto", 500)));

        //animeList.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle(
        // )));
        //animeList.sort((a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
        animeList.sort(AnimeComparators::compareByTitle);
        System.out.println(animeList);

        animeList.sort(AnimeComparators::compareByEpisode);
        System.out.println(animeList);
    }
}
