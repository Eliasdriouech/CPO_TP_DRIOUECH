/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_driouech;
import java.util.Scanner;
/**
 *
 * @author dreli
 */
public class TP2_manip_DRIOUECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int tab[]=new moussaka[10];
    Tartiflette assiette1 = new Tartiflette(500);
    Tartiflette assiette2 = new Tartiflette(600);
    Tartiflette assiette3 = assiette2;
    assiette2.nbCalories = assiette1.nbCalories;
   assiette1.nbCalories= assiette3.nbCalories;

    System.out.println ("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
    System.out.println ("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
    for(int i=0;i<10;i++){
        tab[i]=new Moussaka(500);
    }
    }
    
}
