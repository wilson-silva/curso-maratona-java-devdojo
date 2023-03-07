package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;


import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an istance methods of particular objects
public class MethodReferenceTest02 {
    public static void main(String[] args) {

        AnimeComparators animeComparators = new AnimeComparators();

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 5),
                new Anime("One Piece", 500),
                new Anime("Naruto", 100)));

        //animeList.sort((a1, a2)-> animeComparators.compareByEpisodeNonStatic(a1, a2));
        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        System.out.println(animeList);

    }
}
