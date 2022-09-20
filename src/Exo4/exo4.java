// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package Exo4;
import utils.utils;

public class exo4 {
    /**
     * Il calcule le nième terme de la suite U(n) = (U(n-1)+1)/n avec U(0) = 1
     */
    public static void main(String[] args) {
        System.out.println("Entrez le nombre de terme de la suite n à calculer avec n > 0 (0 pour terminer) :");
        float finalN = utils.getPositiveInt();
        float Un = 0;
        for (float n = 1; n <= finalN; n++) {
            Un = Un+(1/n);
            System.out.println("U(" + n + ") = " + Un);
        }
        System.out.println("Le terme n°" + (int) finalN + " de la suite est " + Math.round(Un * 10000.0) / 10000.0);
        utils.Continue(utils.getExoNumber());
    }
}
