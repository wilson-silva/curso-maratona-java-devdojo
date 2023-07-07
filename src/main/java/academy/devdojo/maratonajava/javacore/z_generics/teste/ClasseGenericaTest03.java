package academy.devdojo.maratonajava.javacore.z_generics.teste;

import academy.devdojo.maratonajava.javacore.z_generics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.z_generics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.z_generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);

        Carro carro = rentalService.buscarObjetosDisponivel();
        System.out.println("Usando o carro por um mes...");
        rentalService.retornarObjetoAlugado(carro);
        System.out.println("------------------------------------");
        Barco barco = rentalService2.buscarObjetosDisponivel();
        System.out.println("Usando o barco por um mes...");
        rentalService2.retornarObjetoAlugado(barco);

    }
}
