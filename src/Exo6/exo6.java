// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package Exo6;

import utils.utils;

public class exo6 {
    /**
     * Il demande à l'utilisateur la taille du tableau, puis demande les valeurs de chaque cellule, puis imprime le tableau
     * avec la somme de chaque ligne et colonne, et enfin la somme de l'ensemble du tableau
     */
    public static void main(String[] args) {
        System.out.println("Entrez la taille du tableau (0 pour terminer) :");
        int taille = utils.getPositiveInt();
        if (taille == 0) {
            utils.SystemOut();
        }
        double[][] tableau = new double[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.println("Entrez la valeur de la case [" + (i+1) + " , " + (j+1) + "] :");
                tableau[i][j] = utils.getDouble();
            }
        }
        System.out.println("\nVoici le tableau :");
        double total = 0;
        double rowCounter = 0;
        double colCounter = 0;
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(tableau[i][j] + " ");
                rowCounter += tableau[i][j];
            }
            System.out.println("(" + rowCounter + ")");
            total += rowCounter;
            rowCounter = 0;
            System.out.println();
        }
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                colCounter += tableau[j][i];
            }
            System.out.print("(" + colCounter + ")");
            colCounter = 0;
        }
        System.out.print("(" + total + ")");
        utils.Continue(utils.getExoNumber());
    }
}
