package menu;

import utils.utils;

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
            case "1" -> System.out.print("Exercice 1");
            case "2" -> System.out.print("Exercice 2");
            case "3" -> System.out.print("Exercice 3");
            case "4" -> System.out.print("Exercice 4");
            case "0" -> {
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
            default -> {
                System.out.println("Choix invalide");
                main(args);
            }
        }
    }
}