import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primera Nota: ");
        double variable1 = scanner.nextDouble();

        System.out.println("Segunda Nota: ");
        double variable2 = scanner.nextDouble();

        System.out.println("Tercera Nota: ");
        double variable3 = scanner.nextDouble();

        double promedio = (variable1 + variable2 + variable3) / 3;

        System.out.println("El promedio es: " + promedio);

        if (promedio >= 7) {
            System.out.println("Uno que sabe");
        } else {
            System.out.println("A diciembre");
        }
    }
}
