package Exo6;

public class exo6 {
    public static void main(String[] args) {
        System.out.println("Entrez la taille du tableau :");
        int taille = utils.utils.getPositiveInt();
        int[][] tableau = new int[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.println("Entrez la valeur de la case [" + (i+1) + "] [" + (j+1) + "] :");
                tableau[i][j] = utils.utils.getInt();
            }
        }
        System.out.println("Voici le tableau :");
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }
    }
}
