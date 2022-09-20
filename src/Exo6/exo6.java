// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package Exo6;

import java.io.*;
import java.util.*;

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
            utils.Continue(utils.getExoNumber());
        }
        double[][] tableau = new double[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.println("Entrez la valeur de la case [" + (i+1) + " , " + (j+1) + "] :");
                tableau[i][j] = utils.getDouble();
            }
        }
        System.out.println("\nVoici le tableau :");
        double rowTotal = 0;
        double colTotal = 0;
        double rowAverage = 0;
        double colAverage = 0;
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.printf("%-10.2f", tableau[i][j]);
                rowAverage += tableau[i][j];
            }
            rowAverage /= taille;
            System.out.println("\u001B[31m"+ "(" + Math.round( rowAverage * 100.0) / 100.0  + ")"+"\u001B[0m");
            rowTotal += rowAverage;
            rowAverage = 0;
            System.out.println();
        }
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                colAverage += tableau[j][i];
            }
            colAverage /= taille;
            System.out.print("\u001B[35m"+ "(" + Math.round( colAverage * 100.0) / 100.0  + ")"+"\u001B[0m");
            colTotal += colAverage;
            colAverage = 0;
        }
        System.out.print("row(" + Math.round( rowTotal * 100.0) / 100.0 + ")");
        System.out.print("col(" + Math.round( colTotal * 100.0) / 100.0 + ")");
        utils.Continue(utils.getExoNumber());
    }
}
