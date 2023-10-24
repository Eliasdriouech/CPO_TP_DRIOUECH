package personnage;

import java.util.ArrayList;
import Armes.Epee;
import Armes.Baton;
import Armes.Armes;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dreli
 */
abstract public class personnage {
    static int nbperso=0;
    private String nom;

    public String getNom() {
        return nom;
    }
    int pv;
    Armes armekp = null;
    
    

    public personnage(String unNom, int unpv, Armes unarmekp,int unnbperso) {
        armekp = unarmekp;
        nom = unNom;
        pv = unpv;
        nbperso=unnbperso+1;
    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + "pv: " + pv+ armekp;
        System.out.println(chaine_a_retourner);
        return chaine_a_retourner;

    }
    ArrayList<Armes> stuff = new ArrayList<Armes>();

    public void ajout(ArrayList<Armes> stuff, Armes nouvelle_arme) {

        if (stuff.size() < 4) {

            stuff.add(nouvelle_arme);

        }

    }

    public Armes getArmekp() {
        return armekp;
    }

    public void selectioner_arm(ArrayList<Armes> stuff, Armes nouvelle_arme) {
        int waekp;
        for (int i = 0; i < stuff.size(); i++) {
            System.out.println(i + ": " + stuff.get(i));

        }
        Scanner sc;
        sc = new Scanner(System.in);
        waekp = sc.nextInt();
        armekp = stuff.get(waekp);
    }

}
