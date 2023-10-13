package com.mycompany.tp2_relation_1_driouech;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
/**
 *
 * @author dreli
 */
public class Personne {
String prenom;
String nom;
Voiture[] liste_voitures;
int nbVoitures ;



public Personne (String unprenom,String unnom){
  nbVoitures= 0;
prenom= unprenom;
nom= unnom;
liste_voitures = new Voiture [3] ;

}
@Override

public String toString(){
   String chaine_a_retourner;
chaine_a_retourner ="nom et prenom" +nom+ prenom ;

return chaine_a_retourner ;
}
  public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            return false;
        }
       
        if (nbVoitures >= 3) {
            return false;
        }
       
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
       
        voiture_a_ajouter.proprietaire = this;
       
        return true;
    }
}


  

