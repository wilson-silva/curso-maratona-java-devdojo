package academy.devdojo.maratonajava.javacore.g_associacao.teste;

import academy.devdojo.maratonajava.javacore.g_associacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        //Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
