package n3exercici1.clases;

import n3exercici1.clases.Noticia;

public class Tenis extends Noticia {

    private String competicio;
    private String tenista;

    public Tenis(String titular, String competicio, String tenista) {
        super(titular);
        this.competicio = competicio;
        this.tenista = tenista;
        super.setPreu(calcularPreuNoticia(tenista));
        super.setPuntuacio(calcularPuntuacioNoticia(tenista));
    }


    private int calcularPreuNoticia(String tenista){

        int preu = 150;

        if(tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")){
            preu += 100;
        }

        return preu;
    }

    private int calcularPuntuacioNoticia(String tenista){

        int puntuacio = 4;

        if(tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")){
            puntuacio += 3;
        }

        return puntuacio;

    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getTenista() {
        return tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Competició: ").append(this.getCompeticio()).append("\n");
        sb.append("Tenista: ").append(this.getTenista()).append("\n");

        return sb.toString();
    }
}
