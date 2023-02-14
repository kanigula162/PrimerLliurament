package n3exercici1.clases;

public abstract class Noticia {

    private String titular;
    private String text = "";
    private int puntuacio;
    private int preu;

    private Redactor redactor;

    public Noticia(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public Redactor getRedactor() {
        return redactor;
    }

    public void setRedactor(Redactor redactor) {
        this.redactor = redactor;
    }

    @Override
    public String toString() {

        if(this.getText().isEmpty()){
            this.setText("Contingut buit...");
        }

        return "Titular: " + getTitular() + "\n" +
                "Text: " + getText() + "\n";

    }
}
