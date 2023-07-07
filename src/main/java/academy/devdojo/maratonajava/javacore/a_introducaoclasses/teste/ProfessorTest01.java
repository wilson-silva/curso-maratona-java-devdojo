package academy.devdojo.maratonajava.javacore.a_introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.a_introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + ", Idade: " + professor.idade + ", Sexo: " + professor.sexo);

    }
}
