package academy.devdojo.maratonajava.javacore.ZZClambdas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LamdaTest01 {
    public static void main(String[] args) {

        List<String>  nomes = List.of("Willian", "Suane", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        myForEach(nomes, nome -> System.out.println(nome));
        System.out.println("----------------------------------");
        myForEach(integers, i -> System.out.println(i));
    }
    private static <T> void myForEach(List<T> list, Consumer<T> consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }
}
