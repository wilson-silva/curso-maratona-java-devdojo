package academy.devdojo.maratonajava.javacore.zzc_lambdas.teste;

import academy.devdojo.maratonajava.javacore.zzc_lambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.zzc_lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a Constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {

        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();

        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Berserk", 5),
                new Anime("One Piece", 500),
                new Anime("Naruto", 100)));

        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episode) -> new Anime(title, episode);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        Anime animeCreated = animeBiFunction2.apply("Demon Slayer", 52);
        animeList.add(animeCreated);
        System.out.println(animeList);
    }
}
