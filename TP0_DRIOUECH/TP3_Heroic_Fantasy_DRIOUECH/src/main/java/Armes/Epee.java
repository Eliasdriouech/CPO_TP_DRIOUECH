package Armes;


import Armes.Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dreli
 */
public class Epee extends Armes {
    int finesse;
    public Epee(String unNom, int unatk_lvl, int unfinesse) {
        super(unNom, unatk_lvl);
        finesse=unfinesse;
        if (unfinesse>100){
    System.out.println("tricheur ton epes sera rouiller") ;
    finesse=1;
    }
    }
    
}
