package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salario != null){
            for(double num : salario){
                System.out.println(num);
            }
            imprimeMedia();
        }else{
                System.out.println("O salario não foi informado");
        }
    }

    public void imprimeMedia(){
        if(salario == null){
            return;
        }
        double media = 0;
        for(double num : salario){
            media += num;
        }
        media /= salario.length;
        System.out.printf("Média salarial: %.2f%n" ,  media);
    }
}
