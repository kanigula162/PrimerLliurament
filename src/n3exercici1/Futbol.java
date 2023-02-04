package n3exercici1;

public class Futbol extends Noticia{

    private String competicio;
    private String club;
    private String jugador;


    public Futbol(String titular, String competicio, String club, String jugador){
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
        super.setPreu(calcularPreuNoticia(competicio, club, jugador));
        super.setPuntuacio(calcularPuntuacioNoticia(competicio, club, jugador));
    }

    private int calcularPreuNoticia(String competicio, String club, String jugador){

        int preu = 300;

        if(competicio.equalsIgnoreCase("Lliga de Campions")){
            preu += 100;
        }

        if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")){
            preu += 100;
        }


        if(jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")){
            preu += 50;
        }

        return preu;
    }

    private int calcularPuntuacioNoticia(String competicio, String club, String jugador){

        int puntuacio = 5;

        if(competicio.equalsIgnoreCase("Lliga de Campions")){
            puntuacio += 3;
        }

        if(competicio.equalsIgnoreCase("Lliga")){
            puntuacio += 2;
        }

        if(club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")){
            puntuacio += 1;
        }


        if(jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")){
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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

}
