/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heroic_fantasy_driouech;

import java.util.ArrayList;

/**
 *
 * @author dreli
 */
public class TP3_Heroic_Fantasy_DRIOUECH {

    public static void main(String[] args) {
      Epee aiguille =  new Epee("Excalibur",7,5);
      Epee couteau =  new Epee("Durandal",4,7);
      Baton stick =  new Baton("Chêne",4,5);
      Baton branche =  new Baton("Charme",5,6);
      ArrayList<Armes> stuff = new ArrayList<Armes>();
      stuff.add(aiguille);
      stuff.add(couteau);
      stuff.add(stick);
      stuff.add(branche);
      for (int i=0; i<stuff.size();i++){
      System.out.println( stuff.get(i));
      }

    }
}
