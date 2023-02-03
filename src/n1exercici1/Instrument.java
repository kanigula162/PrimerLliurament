package n1exercici1;

public abstract class Instrument {

    private String nom;
    private double preu;

    public Instrument(String nom, double preu){
        this.nom = nom;
        this.preu = preu;
    }

    public abstract String tocar();

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public double getPreu() {
        return preu;
    }
}
