package n3exercici1;

public class Motociclisme extends Noticia{

    private String equip;

    public Motociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
        super.setPreu(calcularPreuNoticia(equip));
        super.setPuntuacio(calcularPuntuacioNoticia(equip));
    }

    private int calcularPreuNoticia(String equip){

        int preu = 100;

        if(equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")){
            preu += 50;
        }

        return preu;
    }

    private int calcularPuntuacioNoticia(String equip){

        int puntuacio = 3;

        if(equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")){
            puntuacio += 3;
        }

        return puntuacio;

    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Competició: ").append(this.getEquip()).append("\n");

        return sb.toString();
    }
}
