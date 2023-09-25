/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *anné:FG2
 * @author elias driouech
 * GRP:TDC
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        sc = new Scanner(System.in);
        int operateur;
        int operande1;
        int operande2;

        System.out.println("Please enter the operande1");
        operande1 = sc.nextInt( );
        System.out.println("Please enter the operande2");
        operande2 = sc.nextInt( );
        double resultat;
        System.out.println("Please enter the operator\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo");
        operateur = sc.nextInt( );
        while (operateur<5 ||operateur>1){
        for (int i=1;1<=5;i++){
            if (i==operateur){
            operateur = sc.nextInt( );

            
            resultat=operande2+operande1;
            System.out.println("resultat="+resultat+"");
        }
        if (operateur==2) {
            resultat=operande2-operande1;
            System.out.println("resultat="+resultat+"");
        }
        if (operateur==3) {
            resultat=operande2*operande1;
            System.out.println("resultat="+resultat+"");
        }
        if (operateur==4) {
            resultat=operande2*1.0/operande1*1.0;
            System.out.println("resultat="+resultat+"");
        }
        if (operateur==5) {
            resultat=operande2%operande1;
            System.out.println("resultat="+resultat+"");
        }

            else {
                System.out.println("vous avez mal choisi l'operateur");
                System.out.println("Please enter the operator\n 1) add\n 2) substract\n 3) multiply\n 4) divide\n 5) modulo");
        operateur = sc.nextInt( );

                        
              
       
        }
        }
        }

                
    }
    
}
