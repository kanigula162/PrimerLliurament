package n3exercici1;

import n3exercici1.utilitats.Utilitats;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int seleccio;
        ArrayList<Redactor> redactors = new ArrayList<>();
        ArrayList<Noticia> noticies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1.- Introduir redactor/a.");
            System.out.println("2.- Eliminar redactor/a.");
            System.out.println("3.- Introduir notícia a un redactor/a.");
            System.out.println("4.- Eliminar notícia (ha de demanar redactor/a i titular de la notícia).");
            System.out.println("5.- Mostrar totes les notícies per redactor/a.");
            System.out.println("6.- Calcular puntuació de la notícia.");
            System.out.println("7.- Calcular preu-notícia.");
            System.out.println("8.- Sortir.");

            try{
                System.out.println("\nSeleccioni una opció:");
                seleccio = Integer.parseInt(sc.next());

                if(seleccio < 1 || seleccio > 8){
                    System.out.println("\n>>> Seleccioni un valor del 1 al 8 siusplau <<<\n");
                }else{

                    switch (seleccio){

                        case 1->{

                            String nom = Utilitats.nomRedactor();
                            String dni = Utilitats.dniRedactor();
                            redactors.add(new Redactor(nom, dni));
                            System.out.println("Redactor/a creat/da correctament\n");
                        }

                        case 2-> Utilitats.eliminarRedactors(redactors);

                        case 3->{

                            if(Utilitats.hiHaRedactors(redactors)){
                                Utilitats.crearNoticia(Utilitats.seleccionarRedactor(redactors), noticies);
                            }else{
                                System.out.println(">>> No hi ha redactors donats d'alta, per favor doni d'alta algún redactor primer\n");
                            }
                        }

                        case 4->{}
                        case 5->{
                            Utilitats.mostrarNoticiesPerRedactor(Utilitats.seleccionarRedactor(redactors), noticies);
                        }
                        case 6->{}
                        case 7->{}

                    }

                }

            }catch (Exception e){
                seleccio = 0;
                System.out.println("\n>>> Seleccioni un valor numèric del 1 al 8 siusplau <<<\n");
            }
        }while(seleccio != 8);

        System.out.println("\n#########> FI DEL PROGRAMA <##########");
        System.exit(0);
    }


}
