
import java.util.Scanner;

class VerificarVotacion {
    public boolean puedoVotar(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

public class Votaciones {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // int edad = 16;
        System.out.println("Dame tu edad");
        int edad = scan.nextInt();

        VerificarVotacion votar = new VerificarVotacion();
        if (votar.puedoVotar(edad)) {
            System.out.println("Si, si puedes votar");
        } else {
            System.out.println("No, no podrás votar");
        }
    }
}
