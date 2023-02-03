package n1exercici1;

public class Percussio extends Instrument{

    public Percussio(String nom, double preu){
        super(nom, preu);
    }

    public String tocar(){
        return "Està sonant un instrument de percussió";
    }

    public static String missatge() {
        return "Missatge de l'instrument de percussió amb mètode estàtic";
    }
}
