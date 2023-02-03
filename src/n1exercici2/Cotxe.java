package n1exercici2;

public class Cotxe {

    private static final String MARCA = null;
    private static String model;
    private final int potencia;

    public Cotxe(int potencia){
        this.potencia = potencia;
    }

    public static String frenar(){
        return "El vehicle està frenant";
    }

    public String accelerar(){
        return "El vehicle està accelerant";
    }

}
