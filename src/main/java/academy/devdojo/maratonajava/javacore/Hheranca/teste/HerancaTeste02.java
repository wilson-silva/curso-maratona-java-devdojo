package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02{
    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memória para o objeto da superclasse
    // 3 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado da classe pai
    // 4 - Bloco de inicialização da superclasse é executado na ordem que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaço em memória para o objeto da subclasse
    // 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado da classe filha
    // 8 - Bloco de inicialização da subclasse é executado na ordem que aparece
    // 9 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }

}
