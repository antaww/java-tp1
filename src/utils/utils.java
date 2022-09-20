// Réalisé par :
// - Olivier MISTRAL
// - Antoine PIZZETTA

package utils;

import java.util.Scanner;

/**
 * C'est une classe qui contient des méthodes statiques utilisées pour obtenir l'entrée de l'utilisateur
 */
public class utils {
    /**
     * Il obtient une chaîne de l'utilisateur
     *
     * @return L'entrée de l'utilisateur
     */
    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String choix = scanner.nextLine();
        return choix;
    }

    /**
     * Il vérifie si la chaîne ne contient que des 0 et des 1
     *
     * @param nbr Le nombre à vérifier
     * @return La méthode renvoie une valeur booléenne.
     */
    public static boolean checkBinaries(String nbr) {
        for (int i = 0; i < nbr.length(); i++) {
            if (nbr.charAt(i) != '0' && nbr.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    /**
     * Il demande à l'utilisateur d'entrer un entier et le renvoie
     *
     * @return La méthode renvoie l'entier entré par l'utilisateur.
     */
    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un entier");
            System.out.print("> ");
            scanner.next();
        }
        int choix = scanner.nextInt();
        return choix;
    }

    /**
     * Il demande à l'utilisateur d'entrer un nombre et le renvoie
     *
     * @return Un double
     */
    public static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Veuillez entrer un nombre");
            System.out.print("> ");
            scanner.next();
        }
        double choix = scanner.nextDouble();
        return choix;
    }

    /**
     * Il demande à l'utilisateur d'entrer un entier positif, et si l'utilisateur entre un entier négatif, il demande à
     * nouveau
     *
     * @return La méthode renvoie un entier.
     */
    public static int getPositiveInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un entier positif");
            System.out.print("> ");
            scanner.next();
        }
        int choix = scanner.nextInt();
        if (choix < 0) {
            System.out.println("Erreur, la valeur ne peut pas être négative");
            return getPositiveInt();
        }
        return choix;
    }

    /**
     * Imprime 'Au revoir' puis attend 400 millisecondes et imprime un point, puis attend 400 millisecondes et imprime un
     * point, puis attend 400 millisecondes et imprime un point, puis quitte le programme.
     */
    public static void SystemOut() {
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

    /**
     * Il renvoie le numéro de l'exercice en cours d'exécution
     *
     * @return Le numéro de l'exercice.
     */
    public static int getExoNumber() {
        String className = new Throwable().getStackTrace()[1].getClassName();
        var classChar = className.charAt(className.length() - 1);
        int classInt = Character.getNumericValue(classChar);
        return classInt;
    }

    /**
     * Il permet de choisir entre quitter, revenir au menu ou relancer l'exercice
     *
     * @param exo le numéro d'exercice
     */
    public static <Int> void Continue(Int exo) {
        System.out.println("\nQue voulez-vous faire ?");
        System.out.println("0. Quitter");
        System.out.println("1. Revenir au menu");
        System.out.println("2. Relancer l'exercice");
        String choix = utils.getString();
        switch (choix) {
            case "0" -> {
                utils.SystemOut();
            }
            case "1" -> {
                try {
                    Class<?> c = Class.forName("menu.menu");
                    c.getMethod("main", String[].class).invoke(null, (Object) null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            case "2" -> {
                try {
                    Class<?> c = Class.forName("Exo" + exo + ".exo" + exo);
                    c.getMethod("main", String[].class).invoke(null, (Object) null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            default -> {
                System.out.println("Erreur, veuillez entrer une valeur correcte...");
                utils.Continue(exo);
            }
        }
    }
}


