package n2exercici1;

public class Telefon {

    private String marca;
    private String model;

    public Telefon(String marca, String model){
        this.marca = marca;
        this.model = model;
    }

    public String trucar(String numero){
        return "S'està trucant al telèfon amb número " + numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
