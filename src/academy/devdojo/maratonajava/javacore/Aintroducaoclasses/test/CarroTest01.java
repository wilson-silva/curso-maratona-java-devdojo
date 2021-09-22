package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Agile";
        carro.modelo = "Checrolet";
        carro.ano = 2013;

        carro2.nome = "Uno";
        carro2.modelo = "Fiat";
        carro2.ano = 1998;

        carro2 = carro;

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        System.out.println();
        System.out.println("Carro 2");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
