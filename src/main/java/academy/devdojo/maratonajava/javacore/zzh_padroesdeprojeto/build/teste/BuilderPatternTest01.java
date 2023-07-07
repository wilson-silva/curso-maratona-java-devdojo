package academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.build.teste;

import academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.build.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        var person = Person.PersonBuilder
                .builder()
                .firstName("Wilson")
                .lastName("Silva")
                .username("will")
                .email("wilson@hotmail.com")
                .build();
        System.out.println(person);


    }
}
