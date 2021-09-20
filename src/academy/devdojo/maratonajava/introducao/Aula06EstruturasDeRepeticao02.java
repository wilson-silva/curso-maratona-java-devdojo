package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
    //imprima todos os numeros pares de 0 a 1000000
        int cont = 0;
        while(cont <= 1000000){
            if(cont % 2 == 0){
                System.out.println(cont);
            }
            cont++;
        }
    }
}
