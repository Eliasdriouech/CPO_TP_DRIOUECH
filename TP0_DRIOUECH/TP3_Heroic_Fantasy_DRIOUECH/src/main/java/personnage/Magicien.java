package personnage;
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

public class Magicien extends personnage {
    boolean confirmer;
    public Magicien(String unNom, int unpv, boolean unconfirmer,Armes unarmekp) {
        super(unNom, unpv,unarmekp);
        confirmer=unconfirmer;
    }
    
}
