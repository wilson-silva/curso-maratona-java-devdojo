package academy.devdojo.maratonajava.javacore.z_generics.teste;

import academy.devdojo.maratonajava.javacore.z_generics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.z_generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes...");

        System.out.println("------------------------------------");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
