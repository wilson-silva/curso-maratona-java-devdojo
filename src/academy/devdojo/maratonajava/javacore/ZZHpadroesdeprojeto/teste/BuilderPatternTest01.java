package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.teste;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        var person = new Person.PersonBuilder()
                .firstName("Wilson")
                .lastName("Silva")
                .username("will")
                .email("wilson@hotmail.com")
                .build();
        System.out.println(person);


    }
}
