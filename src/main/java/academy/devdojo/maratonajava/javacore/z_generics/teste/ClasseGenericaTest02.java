package academy.devdojo.maratonajava.javacore.z_generics.teste;

import academy.devdojo.maratonajava.javacore.z_generics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.z_generics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcosDisponivel();
        System.out.println("Usando o barco por um mes...");

        System.out.println("------------------------------------");
        barcoRentavelService.retornarBarcoAlugado(barco);

    }
}
