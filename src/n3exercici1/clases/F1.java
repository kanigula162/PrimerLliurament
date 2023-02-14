package n3exercici1.clases;

public class F1 extends Noticia {

    private String escuderia;

    public F1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
        super.setPreu(calcularPreuNoticia(escuderia));
        super.setPuntuacio(calcularPuntuacioNoticia(escuderia));
    }

    private int calcularPreuNoticia(String escuderia){

        int preu = 100;

        if(escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")){
            preu += 50;
        }

        return preu;
    }

    private int calcularPuntuacioNoticia(String escuderia){

        int puntuacio = 4;

        if(escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")){
            puntuacio += 2;
        }

        return puntuacio;

    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Escuderia: ").append(this.getEscuderia()).append("\n");

        return sb.toString();
    }
}
