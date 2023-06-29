package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Italia", 10);
        Televisao televisao = new Televisao("Sansung 50\" ", 5000);

        CalculadoraImposto.calcularImpostoServico(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImpostoServico(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImpostoServico(televisao);

    }
}
