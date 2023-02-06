package n3exercici1.utilitats;

import n3exercici1.Redactor;
import n3exercici1.exceptions.ErrorDNI;
import n3exercici1.exceptions.ErrorNom;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilitats {

    public static String nomRedactor() {

        String nom = "";
        String nom_corregit = "";
        String[] noms;
        int errors = 0;

        do {

            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Introdueix el nom del redactor:");
                nom = sc.nextLine();

                if(nom.isEmpty()){
                    throw new ErrorNom(">>> El nom no pot estar en blanc\n");
                }

                if(!nom.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")){
                    throw new ErrorNom(">>> El nom introduït te caràcters no vàlids\n");
                }
            }catch (ErrorNom  e){
                errors = 1;
                System.out.println(e.getMessage());
            }

        }while (errors != 0);

        noms = nom.split("\\s");

        for (int i = 0; i < noms.length; i++){
            nom_corregit += noms[i].substring(0, 1).toUpperCase() + noms[i].substring(1).toLowerCase();

            if(noms.length > 0){
                nom_corregit += " ";
            }
        }

        return nom_corregit;
    }

    public static String dniRedactor() {

        String dni = null;
        String dni_num;
        String dni_lletra;
        int errors = 0;
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

    public static void imprimirRedactors(ArrayList<Redactor> redactors){

        int index = 1;

        if(redactors.isEmpty()){
            System.out.println(">>> No hi ha cap redactor/a creats\n");
        }else{
            for (Redactor r:redactors) {
                System.out.println(index + " - Nombre: " + r.getNom() + " DNI: " + r.getDni());
                index++;
            }

        }
    }


}
