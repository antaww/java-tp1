package Exo5;

import utils.utils;

public class exo5 {
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
                int arrayValue = utils.getInt();
                array[i-1] = arrayValue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        System.out.println("La somme du tableau est " + arraySum);
        exo5.main(args);
    }
}
