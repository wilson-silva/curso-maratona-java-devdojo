package academy.devdojo.maratonajava.javacore.ZZEstreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("Willian", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("---------------------------------");
        devdojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);

        Stream<Stream<String>> streamStream = devdojo.stream().map(l -> l.stream());

    }
}
