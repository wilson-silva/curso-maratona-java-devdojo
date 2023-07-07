package academy.devdojo.maratonajava.javacore.zzh_padroesdeprojeto.factory.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency{
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Currency{
    @Override
    public String getSymbol() {
        return "$";
    }
}

