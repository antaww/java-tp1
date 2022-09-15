// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package Exo1;

import static java.lang.Math.sqrt;

import utils.utils;


public class exo1 {
    /**
     * Il calcule la racine carrée d'un nombre.
     */
    public static void main(String[] args) {
        System.out.println("Entrez une valeur positive (0 pour quitter)");
        int nbr = utils.getPositiveInt();
        if (nbr == 0) {
            utils.SystemOut();
        }
        double racine = sqrt(nbr);
        System.out.println("La racine carrée de " + nbr + " est " + Math.round(racine * 1000000.0) / 1000000.0);
        exo1.main(args);
    }
}