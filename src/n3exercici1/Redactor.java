package n3exercici1;

public class Redactor {

    private String nom;
    private String dni;
    private double sou = 1500;

    public Redactor(String nom, String dni){
        this.nom = nom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }
}
