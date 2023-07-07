package academy.devdojo.maratonajava.javacore.y_colecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;
    //--------------------------------------------------------------------------

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }
    //--------------------------------------------------------------------------
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj.getClass() != this.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }
    //--------------------------------------------------------------------------

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    //--------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

