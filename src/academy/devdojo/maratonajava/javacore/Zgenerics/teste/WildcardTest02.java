package academy.devdojo.maratonajava.javacore.Zgenerics.teste;


import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        //printConsulta(cachorros);
    }

   /*
   type erasure, em lista é preciso passar o tipo correto e não a classe Generica neste caso
   por isso que temos o wildcard
   */
    private static void printConsulta(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}