package Exo6;

public class exo6 {
    public static void main(String[] args) {
        System.out.println("Entrez la taille du tableau :");
        int taille = utils.utils.getPositiveInt();
        double[][] tableau = new double[taille][taille];
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.println("Entrez la valeur de la case [" + (i+1) + "] [" + (j+1) + "] :");
                tableau[i][j] = utils.utils.getInt();
            }
        }

        System.out.println("\nVoici le tableau :");
        double total = 0;
        double rowCounter = 0;
        double colCounter = 0;
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(tableau[i][j] + " ");
                rowCounter += tableau[i][j];
            }
            System.out.println("(" + rowCounter + ")");
            total += rowCounter;
            rowCounter = 0;
            System.out.println();
        }
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                colCounter += tableau[j][i];
            }
            System.out.print("(" + colCounter + ")");
            colCounter = 0;
        }
        System.out.print("(" + total + ")");
    }
}
