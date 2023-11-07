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
    GrilleDeCellules grille=new GrilleDeCellules(10,10);
    int nbCoups;
    public Partie(){
   nbCoups=0;
    
            
}
public int initialiserPartie() {
    grille.eteindreToutesLesCellules();
    int diffi=1;
        for (int i=0;i<100000;i++){
         System.out.println("choississez une dificulté"
                 + "1/ facile"
                 + "2/moyen"
                 + "3/difficile");
                 Scanner scanner = new Scanner(System.in);
                 diffi=scanner.nextInt();
        
                 if(diffi>0||diffi<4){
                     
                     break;
                   
                 }
                 else{
                     System.out.println("mauvais choix reasseyez");
                 }
        }
        if (diffi==1){
            GrilleDeCellules grille=new GrilleDeCellules(4,4);
                grille.melangerMatriceAleatoirement(10);
 
        }
          if (diffi==2){
              GrilleDeCellules grille=new GrilleDeCellules(10,10);
                grille.melangerMatriceAleatoirement(10);
    
          }
    if (diffi==3){
        int pepe;
        int pepess;
        Random generateurAleat = new Random();
        pepe=generateurAleat.nextInt(2,20);
        pepess=generateurAleat.nextInt(2,20);
              GrilleDeCellules grille=new GrilleDeCellules(pepe,pepess);
                grille.melangerMatriceAleatoirement(10);
          }
                 
 
                 
        
        return(diffi);
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
 grille.melangerMatriceAleatoirement(10);

        while (!grille.cellulesToutesEteintes()) {

            System.out.println("Grille actuelle :");

            System.out.println(grille);

 

            System.out.println("Entrez un coup: \nl pour ligne \n c pour colonne \n d pour diagonale) :");

            coup = scanner.nextLine();
            
            System.out.println("Entrez un nombre");
            nb=0;
             nb = scanner.nextInt();
 

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

}
 

    public static void main(String[] args) {

        Partie partie = new Partie();

        partie.lancerPartie();

    }
} 


