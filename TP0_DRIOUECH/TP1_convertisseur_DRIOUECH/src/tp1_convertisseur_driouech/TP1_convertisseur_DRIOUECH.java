/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_driouech;

import java.util.Scanner;

/**
 *
 * @author dreli
 */
public class TP1_convertisseur_DRIOUECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc;
        sc = new Scanner(System.in);
        double r;
        double nbr3;
        double kelv;
        int nbr4;
       System.out.println("Please enter a number");
         nbr3= sc.nextDouble( );
         
         System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n"
         +"1) De Celcius vers Kelvin\n"
         +"2) De Kelvin vers celcius\n"
         +"3) de Farenheit Vers Celcius\n"
         +"4)Celcius Vers Farenheit\n"
         +"5)kelvin Vers Farenheit\n"
         +"6)Celcius Vers Farenheit\n");
         nbr4= sc.nextDouble( );
         if (nbr4==1){
             r=CelciusVersKelvin ( nbr3);
             System.out.println("temperature en kelvin="+r);
         }
         if (nbr4==2){
             r=Kelvinverscelcius ( nbr3);
             System.out.println("temperature en celcius="+r);
         }

    }
public static double CelciusVersKelvin (double tCelcius) {
    double kelv;
         kelv=tCelcius+273.15;
System.out.println("temperature en KELVIN\n"+kelv+"kelvin");
return (kelv);
    }
public static double Kelvinverscelcius (double tkelvin) {
 double celc;
         celc=tkelvin+273.15;  
         return (celc);
}
public static double celciusversfarenheit (double tcelcius) {
 double fart;
         fart=(tcelcius+32.0)*9/5;  
         return (fart);
}
public static double kelvinversfarenheit (double tkelvin) {
 double fart;
         fart=(tkelvin+32.0)*9/5+273.0;  
         return (fart);
}
public static double farenheitverscelcius (double tfart) {
 double celc;
         celc=(tfart-32.0)/1.8;  
         return (celc);
}
public static double farenheitverskelvin (double tfart) {
 double kelv;
         kelv=(tfart-32.0)/1.8+273.0;  
         return (kelv);
}
}
