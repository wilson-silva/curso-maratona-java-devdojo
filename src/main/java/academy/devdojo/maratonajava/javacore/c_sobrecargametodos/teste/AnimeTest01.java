package academy.devdojo.maratonajava.javacore.c_sobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.c_sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Boruto", "TV", 12, "Ação");
        anime.imprime();
    }
}
