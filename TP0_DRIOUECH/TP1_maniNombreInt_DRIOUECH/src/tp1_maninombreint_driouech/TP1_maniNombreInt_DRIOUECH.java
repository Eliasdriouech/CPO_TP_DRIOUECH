/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_maninombreint_driouech;

import java.util.Scanner;

/**
 *
 * @author dreli
 */
public class TP1_maniNombreInt_DRIOUECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc;
        sc = new Scanner(System.in);
        int nbr1;
        int nbr2;
        int somme;
        int soustraction;
        int mult;
        int div;
        int rest;
        System.out.println("Please enter a number");
         nbr1 = sc.nextInt( );
         System.out.println("Please enter a number");
          nbr2 = sc.nextInt( );
          somme = nbr1+nbr2;
          soustraction=nbr1-nbr2;
          mult=nbr1*nbr2;
          div=nbr1/nbr2;
          rest=nbr1%nbr2;
          System.out.println("somme="+somme); 
          System.out.println("soustraction="+soustraction); 
          System.out.println("multiplication="+mult); 
          System.out.println("division="+div);
          System.out.println("rest division="+rest); 
    }
    
}
