package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dreli
 */
abstract public class Armes {
    private String nom;

    public String getNom() {
        return nom;
    }
    int atk_lvl;
   
public Armes(String unNom, int unatk_lvl) {
 nom = unNom;
 atk_lvl = unatk_lvl;
   if (atk_lvl>100){
    System.out.println("tricheur tes degats seron a 10") ;
    atk_lvl=10;
}
}
    @Override
    public String toString() {
String chaine_a_retourner;
chaine_a_retourner = nom + "degats: "+ atk_lvl;
System.out.println( chaine_a_retourner);
return chaine_a_retourner ;
}
    
}