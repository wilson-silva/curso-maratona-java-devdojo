package academy.devdojo.maratonajava.javacore.y_colecoes.teste;

import academy.devdojo.maratonajava.javacore.y_colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.y_colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("Wilson Silva");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L,"Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);

        Map<Consumidor, Manga> consumidorMang = new HashMap<>();
        consumidorMang.put(consumidor1, manga1);
        consumidorMang.put(consumidor2, manga4);

        for(Map.Entry<Consumidor, Manga> entry : consumidorMang.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
