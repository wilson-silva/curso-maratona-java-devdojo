package academy.devdojo.maratonajava.javacore.zzc_lambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Natsu", "Allucard");

        List<Integer> map1 = map(strings, s -> s.length());
        List<String> map2 = map(strings, s -> s.toUpperCase());

        System.out.println(map1);
        System.out.println(map2);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e : list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
