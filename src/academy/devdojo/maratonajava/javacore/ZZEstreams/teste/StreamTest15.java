package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.*;

public class StreamTest15 {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tense Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Envergarden", 5.99, Category.DRAMA),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Full Metal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toList())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect2);

        Map<Category, LinkedHashSet<Promotion>> collect3 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion,
                        toCollection(LinkedHashSet::new))));
        System.out.println(collect3);

    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }

}
