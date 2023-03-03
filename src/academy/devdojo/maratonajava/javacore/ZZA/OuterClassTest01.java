package academy.devdojo.maratonajava.javacore.ZZA;

public class OuterClassTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClassTest01 = new OuterClassTest01();

        Inner inner = outerClassTest01.new Inner();
        Inner inner2 = new OuterClassTest01().new Inner();

        inner.printOuterClassAtribute();
        System.out.println("-------------------------------------");
        inner2.printOuterClassAtribute();
    }
}
