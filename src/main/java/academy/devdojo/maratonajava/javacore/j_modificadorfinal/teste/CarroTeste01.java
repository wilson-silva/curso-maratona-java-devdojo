package academy.devdojo.maratonajava.javacore.j_modificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.j_modificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.j_modificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println((carro.COMPRADOR));

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
