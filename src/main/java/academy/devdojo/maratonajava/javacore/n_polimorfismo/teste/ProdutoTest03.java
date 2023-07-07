package academy.devdojo.maratonajava.javacore.n_polimorfismo.teste;

import academy.devdojo.maratonajava.javacore.n_polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.n_polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.n_polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.n_polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("02/01/2022");

        CalculadoraImposto.calcularImpostoServico(produto);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImpostoServico(tomate);

    }
}
