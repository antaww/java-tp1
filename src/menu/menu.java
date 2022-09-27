// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package menu;

import utils.utils;

import java.io.File;

public class menu {

    /**
     * Il imprime une liste de tous les exercices du dossier, puis exécute celui que l'utilisateur choisit
     */
    public static void main(String[] args) {
        System.out.println("Choisissez un exercice :");
        File folder = new File("src");
        File[] listOfFiles = folder.listFiles((dir, name) -> name.toLowerCase().contains("exo"));
        for (int i = 0; i < listOfFiles.length; i++) {
            System.out.println((i+1) + ". Exercice " + (i+1));
        }
        System.out.println("0. Quitter");
        String choix = utils.getString();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (choix.equals(String.valueOf(i+1))) {
                try {
                    Class.forName("Exo" + (i+1) + ".exo" + (i+1)).getMethod("main", String[].class).invoke(null, (Object) args);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (choix.equals("0")) {
            utils.SystemOut();
        } else {
            System.out.println("Choix invalide");
            menu.main(args);
        }
    }
}