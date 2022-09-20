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
                System.out.print("=".repeat(rowCount + 3 - actualRow) + "*".repeat(i) + "=".repeat(rowCount + 3 - actualRow));
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
        System.out.print("\n" + "=".repeat(rowCount + 3 - 1) + "*" + "=".repeat(rowCount + 3 - 1) + "\n"
        + "=".repeat(rowCount+3-2) + "*".repeat(3) + "=".repeat(rowCount+3-2)+"\n");
    }
}
