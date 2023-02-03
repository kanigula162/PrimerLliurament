package n1exercici1;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n------------------------------------------------------------------------------------\n");

        System.out.println("<<<<<<Nivell 1 - Exercici 1>>>>>>>");

        Vent vent = new Vent("Flauta", 250);
        Corda corda = new Corda("Violoncel", 850);
        System.out.println(vent.tocar());
        System.out.println(corda.tocar());
        System.out.println(Percussio.missatge());

        System.out.println("\n------------------------------------------------------------------------------------\n");
    }
}
