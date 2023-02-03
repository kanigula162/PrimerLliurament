package n1exercici1;

public class Vent extends Instrument{

    public Vent(String nom, double preu){
        super(nom, preu);
    }

    public String tocar(){
        return "Està sonant un instrument de vent";
    }

    public static String missatge() {
        return "Missatge de l'instrument de vent amb mètode estàtic";
    }
}
