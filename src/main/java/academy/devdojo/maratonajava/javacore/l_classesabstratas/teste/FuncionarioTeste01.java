package academy.devdojo.maratonajava.javacore.l_classesabstratas.teste;

import academy.devdojo.maratonajava.javacore.l_classesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.l_classesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Zoro", 2000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();
        gerente.imprime();
    }
}
