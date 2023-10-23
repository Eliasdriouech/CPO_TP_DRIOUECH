package personnage;

import java.util.ArrayList;
import Armes.Epee;
import Armes.Baton;
import Armes.Armes;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dreli
 */
abstract public class personnage {
    private String nom;

    public String getNom() {
        return nom;
    }
    int pv;
   
public personnage(String unNom, int unpv) {
 nom = unNom;
 pv = unpv;
}
     @Override
    public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + "pv: "+pv ;
System.out.println( chaine_a_retourner);
return chaine_a_retourner ;

}
          ArrayList<Armes> stuff = new ArrayList<Armes>();
     
    
public static void ajout (ArrayList<Armes> stuff, Armes nouvelle_arme){   

    if (stuff.size()<4){

        stuff.add(nouvelle_arme);

    }

  }
}
    
