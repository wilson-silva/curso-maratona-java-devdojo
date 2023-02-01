package academy.devdojo.maratonajava.javacore.Pwrapper.teste;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        double doubleP = 10D;
        float floaP = 10F;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autobox
        Long longW = 10L;
        Double doubleW = 10D;
        Float floaW = 10F;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer num = Integer.parseInt("1");
        System.out.println(num);

        boolean verdadeiro = Boolean.parseBoolean("TruE");
        System.out.println(verdadeiro);
        System.out.println();
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('B'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isLowerCase('C'));
        System.out.println(Character.toUpperCase('d'));
        System.out.println(Character.toLowerCase('D'));
    }
}
