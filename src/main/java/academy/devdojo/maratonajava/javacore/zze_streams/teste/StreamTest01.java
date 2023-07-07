package academy.devdojo.maratonajava.javacore.zze_streams.teste;

import academy.devdojo.maratonajava.javacore.zze_streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order LightNovel by title
//2. Retrieve the fisrt 3 light novels with price less than 4
public class StreamTest01 {

    private static List<LightNovel> lightNovels =  new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Envergarden", 5.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Full Metal Alchemist", 5.99),
            new LightNovel("Kumo Desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if(lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if(titles.size() >= 3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);

    }
}
