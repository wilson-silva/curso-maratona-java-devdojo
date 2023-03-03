package academy.devdojo.maratonajava.javacore.ZZA;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner{
        public void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassTest01 = new OuterClassesTest01();

        Inner inner = outerClassTest01.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();

        inner.printOuterClassAtribute();
        System.out.println("-------------------------------------");
        inner2.printOuterClassAtribute();
    }
}
