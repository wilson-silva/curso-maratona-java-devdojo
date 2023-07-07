package academy.devdojo.maratonajava.javacore.g_associacao.teste;

import academy.devdojo.maratonajava.javacore.g_associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.g_associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        jogador1.imprime();
        System.out.println();

        Time time = new Time("Brasil");
        jogador1.setTime(time);
        jogador1.imprime();

    }
}
