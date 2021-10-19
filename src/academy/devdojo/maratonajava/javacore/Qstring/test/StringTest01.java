package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Wilson"; //String constant pool
        String nome2 = "Wilson";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Wilson");//não se usa dessa forma
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());





    }
}
