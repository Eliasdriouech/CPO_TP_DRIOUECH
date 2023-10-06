/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_driouech;


/**
 *
 * @author dreli
 */
public class TP2_Bieres_DRIOUECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson");
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;

        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        deuxBiere.Nom = "Leffe";
        deuxBiere.degreAlcool = 6.6;
        deuxBiere.brasserie = "Abbaye de Leffe";
        deuxBiere.ouverte = false;

        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
       uneBiere.Décapsuler();
       uneBiere.lireEtiquette();
       System.out.println(uneBiere) ;

       uneBiere.toString();
       

    }

}
