package personnage;

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
    public Magicien(String unNom, int unpv, boolean unconfirmer) {
        super(unNom, unpv);
        confirmer=unconfirmer;
    }
    
}
