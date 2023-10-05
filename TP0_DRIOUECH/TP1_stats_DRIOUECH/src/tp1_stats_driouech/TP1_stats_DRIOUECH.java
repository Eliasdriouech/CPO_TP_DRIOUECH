/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_driouech;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dreli
 */
public class TP1_stats_DRIOUECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int tab_r [];
        int m;
                
        tab_r = new int[6]; 

        for (int i = 0; i < 5; i++){
       tab_r [i]=0;     
    }
    System.out.println("saisissez un nombre");
    m=sc.nextInt();
            for (int i = 0; i < m-1; i++){
                int n = generateurAleat.nextInt(6);
                tab_r [n]=tab_r [n]+1; 
                System.out.println(tab_r[n]);
                System.out.println(tab_r);
            }
    }
}
