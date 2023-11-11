package lightoff_driouech1_version_console;

import java.util.Random;
import lightoff_driouech1_version_console.GrilleDeCellules;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dreli
 */
public class Partie {
    GrilleDeCellules grille1=new GrilleDeCellules(10,10);
    int nbCoups;
    public Partie(){
   nbCoups=0;
    
            
}
public void initialiserPartie() {
    grille1.eteindreToutesLesCellules();
                    grille1.melangerMatriceAleatoirement(10);
}

    public void lancerPartie() {

        initialiserPartie();
int tcho;
        Scanner scanner = new Scanner(System.in);
String coup;
 int nb;
     Random generateurAleat = new Random();
        System.out.println("Bienvenue dans le jeu LightOff!");
tcho=generateurAleat.nextInt(2,20);
 grille1.melangerMatriceAleatoirement(10);

        while (!grille1.cellulesToutesEteintes()) {

            System.out.println("Grille actuelle :");

            System.out.println(grille1);

            System.out.println("Entrez un coup: \nl pour ligne \n c pour colonne \n d pour diagonale) :");

            coup = scanner.nextLine();
            
            System.out.println("Entrez un nombre");
            nb=0;
             nb = scanner.nextInt();
 

            // Activer la ligne, la colonne ou la diagonale correspondante

            switch (coup) {

                case "l":

                    grille1.activerLigneDeCellules(nb); // Par exemple, vous pouvez activer la première ligne

                    break;

                case "c":

                    grille1.activerColonneDeCellules(nb); // Par exemple, vous pouvez activer la première colonne

                    break;

                case "d":

                    grille1.activerDiagonaleDescendante(); // Par exemple, vous pouvez activer la diagonale descendante

                    break;

                default:

                    System.out.println("Coup invalide. Veuillez entrer 'ligne', 'colonne' ou 'diagonale'.");

            }

            nbCoups++;
            System.out.println("Nombre de coups : " + nbCoups);
        }

 

        System.out.println("Toutes les cellules sont éteintes! Nombre de coups : " + nbCoups);

        scanner.close();

    }

 

    public static void main(String[] args) {

        Partie partie = new Partie();

        partie.lancerPartie();

    }
} 


