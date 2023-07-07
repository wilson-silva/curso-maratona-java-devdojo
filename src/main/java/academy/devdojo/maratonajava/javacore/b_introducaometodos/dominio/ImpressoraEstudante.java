package academy.devdojo.maratonajava.javacore.b_introducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("_______________________");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
    }
}
