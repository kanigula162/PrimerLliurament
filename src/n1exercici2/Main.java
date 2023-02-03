package n1exercici2;

public class Main {

    public static void main(String[] args) {
        System.out.println("<<<<<<Nivell 1 - Exercici 2>>>>>>>");

        Cotxe cotxe = new Cotxe(1600);
        System.out.println(cotxe.accelerar());
        System.out.println(Cotxe.frenar());

        System.out.println("\n------------------------------------------------------------------------------------\n");
    }
}
