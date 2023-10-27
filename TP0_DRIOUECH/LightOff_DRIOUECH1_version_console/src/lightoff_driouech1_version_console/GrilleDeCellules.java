package lightoff_driouech1_version_console;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dreli
 */
public class GrilleDeCellules {

    CelluleLumineuse[][] matriceCellules = null;
    int nbLignes;
    int nbColonnes;

    public  GrilleDeCellules(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
             matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        for (int i = 0; i < n; i++) {
            int f = generateurAleat.nextInt(101);
            if (f < 50) {
                int r = generateurAleat.nextInt(10);
                for (int j = 0; j < 10; j++) {
                    matriceCellules[r][j].activerCellule();
                }
            }
            if (f > 50 || f < 100) {
                int r = generateurAleat.nextInt(10);
                for (int j = 0; j < 10; j++) {
                    matriceCellules[j][r].activerCellule();
                }
            }
            if (f == 100) {
                
                for (int j = 0; j < 10; j++) {
                    matriceCellules[j][j].activerCellule();
                }
                if (f == 101) {
      
                    for (int j = 0; j < 10; j++) {
                        matriceCellules[j][9 - j].activerCellule();
                    }
                }

            }
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }
public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }
public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
}
 public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }
  @Override
    public String toString() {
        StringBuilder gridString = new StringBuilder();

        gridString.append(" |");
        for (int i = 0; i < nbColonnes; i++) {
            gridString.append(" " + i + " |");
        }
        gridString.append("\n");
        for (int i = 0; i < nbLignes; i++) {
            gridString.append("--------------------------------\n");
            gridString.append(i + " |");
            for (int j = 0; j < nbColonnes; j++) {
                gridString.append(" " + (matriceCellules[i][j].getEtat() ? "X" : "O") + " |");
            }
            gridString.append("\n");
        }
        gridString.append("--------------------------------\n");

        return gridString.toString();
    }



}
