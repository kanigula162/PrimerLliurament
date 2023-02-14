package n3exercici1.clases;

public class Basquet extends Noticia {

    private String competicio;
    private String club;

    public Basquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        super.setPreu(calcularPreuNoticia(competicio, club));
        super.setPuntuacio(calcularPuntuacioNoticia(competicio, club));
    }

    private int calcularPreuNoticia(String competicio, String club){

        int preu = 250;

        if(competicio.equalsIgnoreCase("Eurolliga")){
            preu += 75;
        }

        if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")){
            preu += 75;
        }

        return preu;
    }

    private int calcularPuntuacioNoticia(String competicio, String club){

        int puntuacio = 4;

        if(competicio.equalsIgnoreCase("Eurolliga")){
            puntuacio += 3;
        }

        if(competicio.equalsIgnoreCase("ACB")){
            puntuacio += 2;
        }

        if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")){
            puntuacio += 1;
        }


        return puntuacio;

    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {

        return super.toString() + "Competició: " + this.getCompeticio() + "\n" +
                "Club: " + this.getClub() + "\n";
    }
}
