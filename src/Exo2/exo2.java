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
            }
            else {
                System.out.print("\u001B[34m"+ "=".repeat(rowCount + 3 - actualRow) + "\u001B[32m" + "*".repeat(i) + "\u001B[34m" + "=".repeat(rowCount + 3 - actualRow) + "\u001B[0m");
            }
        }
        trunk(rowCount);
        utils.Continue(utils.getExoNumber());
    }

    /**
     * Il imprime le tronc de l'arbre
     *
     * @param rowCount le nombre de lignes dans l'arbre
     */
    private static void trunk(int rowCount) {
        System.out.print("\n"+"\u001B[34m"+ "=".repeat(rowCount + 3 - 1) +"\u001B[33m" + "*" +"\u001B[34m"+ "=".repeat(rowCount + 3 - 1) + "\n"
        + "=".repeat(rowCount+3-2) + "\u001B[33m" + "*".repeat(3) +"\u001B[34m"+ "=".repeat(rowCount+3-2)+"\u001B[0m"+"\n");
    }
}
