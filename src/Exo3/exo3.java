// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package Exo3;

import utils.utils;

public class exo3 {
    /**
     * Il demande à l'utilisateur de choisir entre convertir un nombre binaire en nombre décimal ou un nombre décimal en
     * nombre binaire, puis il appelle la fonction appropriée
     */
    public static void main(String[] args) {
        System.out.println("Voulez-vous convertir :");
        System.out.println("1. Un nombre binaire en décimal");
        System.out.println("2. Un nombre décimal en binaire");
        System.out.println("0. Quitter");
        int choix = utils.getInt();
        switch (choix) {
            case 1 -> {
                System.out.println("Entrez un nombre binaire");
                String nbr = utils.getString();
                if (utils.checkBinaries(nbr)) {
                    try {
                        System.out.println("Le nombre " + nbr + " en décimal est " + Integer.parseInt(nbr, 2));
                    } catch (NumberFormatException e) {
                        System.out.println("Le nombre binaire est trop grand");
                    }
                } else {
                    System.out.println("Ce n'est pas un nombre binaire...");
                    exo3.main(args);
                }
            }
            case 2 -> {
                System.out.println("Entrez un nombre décimal");
                int nbr = utils.getInt();
                String bin = Integer.toBinaryString(nbr);
                System.out.println("Le nombre " + nbr + " en binaire est " + bin);
            }
            case 0 -> {
                utils.SystemOut();
            }
            default -> {
                System.out.println("Choix invalide");
                exo3.main(args);
            }
        }
        utils.Continue(utils.getExoNumber());
    }
}
