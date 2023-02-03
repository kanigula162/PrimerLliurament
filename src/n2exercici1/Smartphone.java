package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge{

    public Smartphone(String marca, String model){
        super(marca, model);
    }

    public String fotografiar(){
        return "S’està fent una foto";
    }

    public String alarma(){
        return "Està sonant l’alarma";
    }
}
