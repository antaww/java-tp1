package Exo4;
import utils.utils;

public class exo4 {
    public static void main(String[] args) {
        System.out.println("Entrez le nombre de terme de la suite n à calculer avec n > 0 (0 pour terminer gros) :");
        float finalN = utils.getPositiveInt();
        float Un = 1;
        for (float n = 1; n <= finalN; n++) {
            Un = (Un+1)/n;
        }
        System.out.println(Un);
    }
}
