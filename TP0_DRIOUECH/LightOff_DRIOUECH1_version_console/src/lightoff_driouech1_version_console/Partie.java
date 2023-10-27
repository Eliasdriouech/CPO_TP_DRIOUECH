package lightoff_driouech1_version_console;

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
    GrilleDeCellules grille=new GrilleDeCellules(10,10);
    int nbCoups;
    public Partie(){
   nbCoups=0;
    
            
}
public void initialiserPartie() {
    grille.eteindreToutesLesCellules();
    grille.melangerMatriceAleatoirement(10);

    
    
}
    public void lancerPartie() {

        initialiserPartie();

        Scanner scanner = new Scanner(System.in);

 

        System.out.println("Bienvenue dans le jeu LightOff!");

 

        while (!grille.cellulesToutesEteintes()) {

            System.out.println("Grille actuelle :");

            System.out.println(grille);

 

            System.out.println("Entrez un coup: \nl pour ligne \n c pour colonne \n d pour diagonale) :");

            String coup = scanner.nextLine();
            System.out.println("Entrez un nombre");
            int nb = scanner.nextInt();
 

            // Activer la ligne, la colonne ou la diagonale correspondante

            switch (coup) {

                case "l":

                    grille.activerLigneDeCellules(nb); // Par exemple, vous pouvez activer la première ligne

                    break;

                case "c":

                    grille.activerColonneDeCellules(nb); // Par exemple, vous pouvez activer la première colonne

                    break;

                case "d":

                    grille.activerDiagonaleDescendante(); // Par exemple, vous pouvez activer la diagonale descendante

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


