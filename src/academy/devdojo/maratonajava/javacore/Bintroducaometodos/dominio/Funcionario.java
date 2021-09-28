package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

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
        for(double num : salario){
            media += num;
        }
        media /= salario.length;
        System.out.printf("Média salarial: %.2f%n" ,  media);
    }
}
