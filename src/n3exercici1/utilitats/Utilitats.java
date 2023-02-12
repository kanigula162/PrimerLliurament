package n3exercici1.utilitats;

import n3exercici1.Redactor;
import n3exercici1.exceptions.ErrorDNI;
import n3exercici1.exceptions.ErrorNom;
import n3exercici1.exceptions.ErrorSeleccio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilitats {

    public static String nomRedactor() {

        String nom = "";
        StringBuilder nom_corregit = new StringBuilder();
        String[] noms;
        int errors;

        do {

            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Introdueix el nom del redactor:");
                nom = sc.nextLine();

                if(nom.isEmpty()){
                    throw new ErrorNom(">>> El nom no pot estar en blanc\n");
                }

                if(!nom.matches("[a-zA-ZàáèéíòóúÀÁÈÉÍÒÓÚ]+([ '-][a-zA-ZàáèéíòóúÀÁÈÉÍÒÓÚ]+)*")){
                    throw new ErrorNom(">>> El nom introduït te caràcters no vàlids\n");
                }else{
                    errors = 0;
                }
            }catch (ErrorNom  e){
                errors = 1;
                System.out.println(e.getMessage());
            }

        }while (errors != 0);

        noms = nom.split("\\s");

        for (String s : noms) {
            nom_corregit.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase());

            if (Array.getLength(noms) > 0) {
                nom_corregit.append(" ");
            }
        }

        return nom_corregit.toString();
    }

    public static String dniRedactor() {

        String dni = null;
        String dni_num;
        int errors;
        int num;
        String[] lletres = {
                "T", "R", "W","A","G","M","Y","F","P","D","X",
                "B","N","J","Z","S","Q","V","H","L","C","K","E"
        };

        do {

            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Introdueix el DNI del redactor (ex. 12345678Z):");
                dni = sc.next();

                if(dni.isEmpty()){
                    throw new ErrorDNI(">>> El DNI no pot estar en blanc\n");
                }

                if(!dni.matches("[0-9]{8}[a-zA-Z]")){

                    if(dni.matches("[0-9]{8}")){
                        throw new ErrorDNI(">>> Manca la lletra al DNI introduït\n");
                    }

                    throw new ErrorDNI(">>> El DNI introduït te caràcters no vàlids\n");

                }else{
                    dni_num = dni.substring(0, dni.length() - 1);
                    num = Integer.parseInt(dni_num) % 23;

                    if(lletres[num].equalsIgnoreCase(dni.substring(dni.length() -1))){
                        dni = dni.toUpperCase();
                        errors = 0;
                    }else{
                        throw new ErrorDNI(">>> La lletra del DNI no es correcta\n");
                    }

                }
            }catch (ErrorDNI  e){
                errors = 1;
                System.out.println(e.getMessage());
            }

        }while (errors != 0);

        return dni;
    }

    public static void eliminarRedactors(ArrayList<Redactor> redactors){

        int index;
        int seleccio;
        int error;

        if(redactors.isEmpty()){
            System.out.println(">>> No hi ha cap redactor/a creats\n");
        }else{

            do{
                index = 1;

                for (Redactor r:redactors) {
                    System.out.println(index + " - Nombre: " + r.getNom() + " DNI: " + r.getDni());
                    index++;
                }

                try{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Selecciona el redactor/a que desitges eliminar:");
                    seleccio = sc.nextInt();

                    if(redactors.size() < seleccio){
                        throw new ErrorSeleccio(">>> El valor seleccionat no pertany a cap redactor\n");
                    }else if(seleccio < 1){
                        throw new ErrorSeleccio(">>> El valor no pot ser cero o negatiu\n");
                    }else{
                        Redactor redactor = redactors.get((seleccio - 1));
                        if(redactors.remove(redactor)){
                            System.out.println("Redactor eliminat correctament");
                            error = 0;
                        }else{
                            System.out.println("Ha hagut un error inesperat i no se ha eliminat el redactor/a correctament");
                            error = 1;
                        }

                    }

                }catch (ErrorSeleccio e){
                    error = 1;
                    System.out.println(e.getMessage());
                }catch (InputMismatchException e){
                    error = 1;
                    System.out.println(">>> El valor introduït no es correcta\n");
                }

            }while (error != 0);

        }
    }

    public static boolean hiHaRedactors(ArrayList<Redactor> redactors){
        return redactors.size() > 0;
    }

    public static void crearNoticia(){

        boolean tornar = true;
        int seleccio = 0;
        String titular, competicio, club, jugador, tenistes, escuderia, equip;

        do{
            try{
                System.out.println("\nSeleccioni la categoria: ");
                System.out.println("1 - Futbol");
                System.out.println("2 - Bàsquet");
                System.out.println("3 - Tenis");
                System.out.println("4 - F1");
                System.out.println("5 - Motociclisme");
                System.out.println("Seleccioni una opció:");
                Scanner sc = new Scanner(System.in);
                seleccio = sc.nextInt();

                if(seleccio >= 1 && seleccio <= 5){
                    tornar = false;
                }

                if(seleccio <= 0){
                    throw new ErrorSeleccio(">>> La selecció no pot ser cero o números negatius\n");
                }

                if(seleccio > 5){
                    throw new ErrorSeleccio(">>> La selecció no pot ser superior a les opcions disponibles\n");
                }

            }catch (InputMismatchException e){
                System.out.println(">>> El dígit introduït no es correcta\n");
            }catch (ErrorSeleccio e){
                System.out.println(e.getMessage());
            }

        }while (tornar);

        switch (seleccio){
            case 1:
                titular = dadesNoticia("titular");
                competicio = dadesNoticia("competició");
                club = dadesNoticia("club");
                jugador = dadesNoticia("jugador");

                break;
            case 2:

                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }

    }


    private static String dadesNoticia(String camp){

        boolean tornar = true;
        String dada;

        do{
            if(camp.equalsIgnoreCase("competició") || camp.equalsIgnoreCase("competicio")){
                System.out.println("Introdueix les dades de la " + camp + ": ");
            }else{
                System.out.println("Introdueix les dades del " + camp + ": ");
            }

            Scanner sc = new Scanner(System.in);
            dada = sc.nextLine();

            if(dada.isEmpty()){
                if(camp.equalsIgnoreCase("competició") || camp.equalsIgnoreCase("competicio")){
                    System.out.println(">>> Les dades de la " + camp + " no pot estar buida\n");
                }else{
                    System.out.println(">>> les dades del " + camp + " no pot estar buit\n");
                }
            }else if (dada.length() < 5) {
                if(camp.equalsIgnoreCase("competició") || camp.equalsIgnoreCase("competicio")){
                    System.out.println(">>> Les dades de la " +  camp + " ha de contenir com a minim 5 caràcters");
                }else{
                    System.out.println(">>> Les dades del " +  camp + " ha de contenir com a minim 5 caràcters");
                }
            }else{
                tornar = false;
            }
        }while(tornar);

        return dada;
    }

    private static String crearTextNoticia(){

        boolean sortir = true;
        int eleccio = 0;
        String text = "";

        do{

            try{
                System.out.println("Vos asignar un text a la notícia: ");
                System.out.println("1 - Sí");
                System.out.println("2 - No");
                Scanner sc = new Scanner(System.in);
                eleccio = sc.nextInt();

                if(eleccio == 1 || eleccio == 2){
                    sortir = false;
                }
            }catch (InputMismatchException e){
                System.out.println(">>> El dígit introduït no es correcta\n");
            }

        }while (sortir);

        sortir = true;

        if(eleccio == 1){
            do{
                System.out.println("Escriu el teu text: ");
                Scanner sc = new Scanner(System.in);
                text = sc.nextLine();

                if(text.isEmpty()){
                    System.out.println(">>> El text no pot estar buit\n");
                }else{
                    sortir = false;
                }
            }while (sortir);
        }

        return text;

    }
}
