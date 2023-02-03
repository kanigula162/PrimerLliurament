package n1exercici1;

public class Corda extends Instrument{

    public Corda(String nom, double preu){
        super(nom, preu);
    }

    public String tocar(){
        return "Està sonant un instrument de corda";
    }

    public static String missatge() {
        return "Missatge de l'instrument de corda amb mètode estàtic";
    }
}
