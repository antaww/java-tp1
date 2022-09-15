package Exo1;
import static java.lang.Math.sqrt;

import utils.utils;


public class exo1 {
    public static void main(String[] args) {
        System.out.println("Entrez une valeur positive (0 pour quitter)");
        int nbr = utils.getPositiveInt();
        if (nbr == 0) {
            System.out.print("Au revoir");
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(".");
            }
            System.exit(0);
        }
        double racine = sqrt(nbr);
        System.out.println("La racine carrée de " + nbr + " est " + Math.round(racine * 1000000.0) / 1000000.0);
    }
}