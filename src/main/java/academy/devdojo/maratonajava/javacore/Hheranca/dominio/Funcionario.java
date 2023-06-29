package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static{
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }

    {
        System.out.println("Dentro do bloco inicialização de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco inicialização de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcioanario");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome+ "recebi o salário de " + this.salario);
    }


}
