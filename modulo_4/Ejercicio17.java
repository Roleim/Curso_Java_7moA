import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota de la primera evaluación: ");
        int nota1 = scanner.nextInt();

        System.out.print("Ingrese la nota de la segunda evaluación: ");
        int nota2 = scanner.nextInt();

        System.out.print("Ingrese la nota de la tercera evaluación: ");
        int nota3 = scanner.nextInt();

        int suma = nota1 + nota2 + nota3;
        int promedio = suma / 3;

        boolean aprobado = promedio >= 7;

        String estado = aprobado ? "Aprobado" : "Reprobado";

        System.out.println("El alumno está " + estado + " con un promedio de " + promedio);
    }
}
