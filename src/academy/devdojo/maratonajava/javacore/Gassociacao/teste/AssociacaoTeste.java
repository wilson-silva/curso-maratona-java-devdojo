package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

import java.util.Scanner;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o local: ");
        String local1 = sc.nextLine();
        Local local = new Local(local1);


        System.out.print("Informe o nome do aluno: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Informe a idade do aluno: ");
        int idade = sc.nextInt();
        Aluno aluno = new Aluno(nomeAluno, idade);
        System.out.println();
        sc.nextLine();

        System.out.print("Informe o nome do aluno: ");
        String nomeAluno1 = sc.nextLine();
        System.out.print("Informe a idade do aluno: ");
        int idade1 = sc.nextInt();
        Aluno aluno1 = new Aluno(nomeAluno1, idade1);
        System.out.println();
        sc.nextLine();

        System.out.print("Informe o nome do professor: ");
        String nomeProfessor = sc.nextLine();
        System.out.print("Informe a especialidade do professor: ");
        String especialidade = sc.nextLine();
        Professor professor = new Professor(nomeProfessor, especialidade );
        System.out.println();

        System.out.print("Informe o titulo do seminário: ");
        String titulo = sc.nextLine();

        Aluno[] alunosSeminario = {aluno, aluno1};


        Seminario seminario = new Seminario(titulo, alunosSeminario, local );


        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();



    }
}
