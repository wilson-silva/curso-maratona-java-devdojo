package academy.devdojo.maratonajava.javacore.k_enum.teste;

import academy.devdojo.maratonajava.javacore.k_enum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.k_enum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.k_enum.dominio.TipoPagamento;



public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);



    }
}
