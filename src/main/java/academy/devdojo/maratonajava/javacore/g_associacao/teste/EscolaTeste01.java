package academy.devdojo.maratonajava.javacore.g_associacao.teste;

import academy.devdojo.maratonajava.javacore.g_associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.g_associacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Gai Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();

    }
}
