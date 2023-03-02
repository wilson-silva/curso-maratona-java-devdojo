package academy.devdojo.maratonajava.javacore.Zgenerics.teste;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

   /*
   Type erasure. Em lista é preciso passar o tipo correto e não a classe Generica neste caso
   por isso que temos o wildcard ?.

   List<? extends Animal> -> somenete para leitura, não sera possivel adicionar elemento nesta lista,
   extends neste caso e tanto para clase ou interface.
   */
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    /*
    recebe animal ou pai (classes acima), desta forma a opção é usar Object e usar instanceof para
    verificar o tipo do objeto. É possivel adicionar elemento pois há garantia que o tipo da lista
    é Animal.
    */
    private static void printConsultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}