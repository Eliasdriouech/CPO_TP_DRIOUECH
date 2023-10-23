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
public class Baton extends Armes{
    int age;
    public Baton(String unNom, int unatk_lvl,int unage) {
        super(unNom, unatk_lvl);
        age=unage;
        if (unage>100){
    System.out.println("tricheur ton age sera a 1 ANS") ;
    age=1;
    }
    }
    
    
}
