package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(a -> System.out.print(a + " "));
        System.out.println();

        //Fibonacci - (0,1) (1, 2) (2, 3) (3, 5) (5, 8)
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(a -> System.out.print(Arrays.toString(a) + " "));
        System.out.println();

        //Fibonacci - 0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 60))
                .limit(6)
                .distinct()
                .sorted()
                .forEach(a -> System.out.print(a + " "));
    }
}
