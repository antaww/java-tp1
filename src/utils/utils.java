package utils;

import java.util.Scanner;

public class utils {
    public static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String choix = scanner.nextLine();
        return choix;
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
            System.out.println("Veuillez entrer un nombre positif");
            return getPositiveInt();
        }
        return choix;
    }
}


