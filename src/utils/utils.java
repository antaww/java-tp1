package utils;

import java.util.Scanner;

public class utils {
    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String choix = scanner.nextLine();
        return choix;
    }

    public static boolean checkBinaries(String nbr) {
        for (int i = 0; i < nbr.length(); i++) {
            if (nbr.charAt(i) != '0' && nbr.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre");
            System.out.print("> ");
            scanner.next();
        }
        int choix = scanner.nextInt();
        return choix;
    }

    public static int getPositiveInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre");
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
}


