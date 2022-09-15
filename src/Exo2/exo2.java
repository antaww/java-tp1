// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package Exo2;

import utils.utils;

public class exo2 {
    /**
     * Il imprime un arbre avec une hauteur de nbr, où nbr est le nombre de lignes de l'arbre
     */
    public static void main(String[] args) {
        System.out.println("Hauteur de l'arbre :");
        int nbr = utils.getPositiveInt();
        int maxRow = nbr * 2 - 1;
        int rowCount = (maxRow + 1) / 2;
        int actualRow = 1;
        for (int i = 1; i <= maxRow; i++) {
            if (i % 2 == 0) {
                System.out.println();
                actualRow++;
            } else {
                for (int j = 1; j <= rowCount+3 - actualRow; j++) {
                    System.out.print("=");
                }
                for(int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= rowCount+3 - actualRow; j++) {
                    System.out.print("=");
                }
            }
        }
        trunk(rowCount);
    }

    /**
     * Il imprime le tronc de l'arbre
     *
     * @param rowCount le nombre de lignes dans l'arbre
     */
    private static void trunk(int rowCount) {
        System.out.println();
        for (int j = 1; j <= rowCount +3 - 1; j++) {
            System.out.print("=");
        }
        System.out.print("*");
        for (int j = 1; j <= rowCount +3 - 1; j++) {
            System.out.print("=");
        }
        System.out.println();
        for (int j = 1; j <= rowCount +3 - 2; j++) {
            System.out.print("=");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        for (int j = 1; j <= rowCount +3 - 2; j++) {
            System.out.print("=");
        }
    }
}
