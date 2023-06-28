import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1 - Elija su jugada (0: piedra, 1: papel, 2: tijera): ");
        int jugada1 = scanner.nextInt();

        System.out.print("Jugador 2 - Elija su jugada (0: piedra, 1: papel, 2: tijera): ");
        int jugada2 = scanner.nextInt();

        if (jugada1 == jugada2) {
            System.out.println("Empate");
        } else if ((jugada1 == 0 && jugada2 == 2) || (jugada1 == 1 && jugada2 == 0) || (jugada1 == 2 && jugada2 == 1)) {
            System.out.println("Jugador 1 gana");
        } else {
            System.out.println("Jugador 2 gana");
        }
    }
}
