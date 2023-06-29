package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.factory.dominio;

public class ConcreteCurrencyFactory  {

    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No currency found for this  country");
        }
    }
}
