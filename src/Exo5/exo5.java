// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package Exo5;

import utils.utils;

public class exo5 {
    /**
     * Il demande à l'utilisateur la taille d'un tableau, puis demande les valeurs de chaque élément du tableau, puis
     * ajoute tous les éléments du tableau et imprime le résultat
     */
    public static void main(String[] args) {
        System.out.println("Entrez la taille du tableau (0 pour terminer) :");
        int arrayLength = utils.getPositiveInt();
        double[] array = new double[arrayLength];
        double arraySum = 0;
        if (arrayLength == 0) {
            utils.SystemOut();
        } else {
            for (int i = 1; i < arrayLength+1; i++) {
                System.out.println("Entrez la valeur " + i + " :");
                double arrayValue = utils.getDouble();
                array[i-1] = arrayValue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        System.out.println("La somme du tableau est " + arraySum);
        utils.Continue(utils.getExoNumber());
    }
}
