package lightoff_driouech1_version_console;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dreli
 */
public class CelluleLumineuse {
    private boolean etat=false;
    public CelluleLumineuse() {
    }
    public void activerCellule() {
        
etat=!etat;
        }
    
    public void eteindreCellule() {
        if (etat==true){
etat=false;
        }
}
        public boolean estEteint(){
            if (etat==true){
                return (false);
            }
            return (true);
        }
        public boolean getEtat(){
            if (etat==true){
                return (true);
            }
            return (false);
        }
        public String toString() {
        String chaine_a_retourner="";
        if (etat==true){
        chaine_a_retourner = "X";

        }
        if (etat==false){
            chaine_a_retourner = "O";
        }

        return chaine_a_retourner;
        }
}