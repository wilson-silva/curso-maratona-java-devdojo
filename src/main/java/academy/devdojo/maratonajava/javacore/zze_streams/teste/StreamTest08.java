package academy.devdojo.maratonajava.javacore.zze_streams.teste;

import academy.devdojo.maratonajava.javacore.zze_streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {

    private static List<LightNovel> lightNovels =  new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Envergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Full Metal Alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {

        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(p -> p > 3)
                .sum();
        System.out.println(sum);


    }
}
