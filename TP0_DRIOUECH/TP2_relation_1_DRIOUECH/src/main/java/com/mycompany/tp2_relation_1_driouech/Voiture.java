package com.mycompany.tp2_relation_1_driouech;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dreli
 */
public class Voiture {
    Personne Proprietaire ;
String Modele;
String Marque;
int Puissance;
public Voiture (String unModele,String unMarque,int unePuissance ){
Modele= unModele;
Marque= unMarque;
Puissance=unePuissance;
Proprietaire=null;
}

@Override
public String toString(){
   String chaine_a_retourner;
   chaine_a_retourner ="marque et modele" + Marque + Modele ;

return chaine_a_retourner ;

}
}




