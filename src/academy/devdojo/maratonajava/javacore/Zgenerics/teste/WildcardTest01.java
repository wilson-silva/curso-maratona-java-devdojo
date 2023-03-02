package academy.devdojo.maratonajava.javacore.Zgenerics.teste;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando doquinho");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);

        //Desta forma esta correta pois esta se utilizando do polimorfismo,
        Animal[] animals = {new Gato(), new Cachorro()};
        printConsulta(animals);
    }
    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

        //animals[1] = new Gato(); -> lança exceção pois esta tentando adicionar gato na lista de cachorro
    }
}