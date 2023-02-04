package n3exercici1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int seleccio;

        do{
            System.out.println("1.- Introduir redactor/a.");
            System.out.println("2.- Eliminar redactor/a.");
            System.out.println("3.- Introduir notícia a un redactor/a.");
            System.out.println("4.- Eliminar notícia (ha de demanar redactor/a i titular de la notícia).");
            System.out.println("5.- Mostrar totes les notícies per redactor/a.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular preu-notícia.");
            System.out.println("8.- Sortir.");
            Scanner sc = new Scanner(System.in);
            try{
                seleccio = Integer.parseInt(sc.next());

            }catch (Exception e){
                seleccio = 0;
            }
        }while(seleccio != 8);

    }
}
