package academy.devdojo.maratonajava.javacore.o_exception.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return  a/b;
    }
}
