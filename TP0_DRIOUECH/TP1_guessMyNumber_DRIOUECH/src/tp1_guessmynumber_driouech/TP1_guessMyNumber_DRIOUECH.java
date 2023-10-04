/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_driouech;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dreli
 */
public class TP1_guessMyNumber_DRIOUECH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int Guess = 0;
        int diff;
        int pq = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
       System.out.println("Please enter a dificulty \n1) easy\n2) medium \n3) hard"); 
       diff = sc.nextInt();
        System.out.println("Please enter a number");
        Guess = sc.nextInt();

        for (int i = 0; i < 1000; i++) {
            if (0>Guess||100<Guess) {
                System.out.println("Please enter a valid number");
        Guess = sc.nextInt();
            }
            else{
                if (n == Guess) {
                    System.out.println("conglaturation you won after "+i+1+" try");
                    break;
                }
                if (n < Guess) {
                    System.out.println("TRop grand");
                    Guess = sc.nextInt();

                }
                if (n > Guess) {
                    System.out.println("Trop petit");
                    Guess = sc.nextInt();

                }

            }
        }
        }
public static double medium (int ) {
    double kelv;
         kelv=tCelcius+273.15;
System.out.println("temperature en KELVIN\n"+kelv+"kelvin");
return (kelv);
    }
    }
