package academy.devdojo.maratonajava.javacore.g_associacao.teste;

import academy.devdojo.maratonajava.javacore.g_associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.g_associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();


        System.out.println();
        System.out.println("--- Time ---");
        time.imprime();

    }
}
