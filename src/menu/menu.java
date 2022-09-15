package menu;

import Exo2.exo2;
import Exo3.exo3;
import utils.utils;
import Exo1.exo1;

public class menu {
    public static void main(String[] args) {
        System.out.println("Choisissez un exercice :");
        System.out.println("1. Exercice 1 - Hello World");
        System.out.println("2. Exercice 2");
        System.out.println("3. Exercice 3");
        System.out.println("4. Exercice 4");
        System.out.println("0. Quitter");
        String choix = utils.getString();
        switch (choix) {
            case "1" -> exo1.main(args);
            case "2" -> exo2.main(args);
            case "3" -> exo3.main(args);
            case "4" -> System.out.print("Exercice 4");
            case "0" -> {
                utils.SystemOut();
            }
            default -> {
                System.out.println("Choix invalide");
                main(args);
            }
        }
    }
}