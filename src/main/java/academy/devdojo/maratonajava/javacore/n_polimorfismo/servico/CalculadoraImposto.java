package academy.devdojo.maratonajava.javacore.n_polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.n_polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.n_polimorfismo.dominio.Tomate;


public class CalculadoraImposto {

    public static void calcularImpostoServico(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto:  " + produto.getNome());
        System.out.println("Valor:  " + produto.getValor());
        System.out.println("Imposto a ser pago:  " + imposto);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
            //Tomate tomate = (Tomate) produto;
            //System.out.println("Data de validade: " + tomate.getDataValidade());
        }



    }
}
