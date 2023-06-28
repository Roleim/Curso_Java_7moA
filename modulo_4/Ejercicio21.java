import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese la categoría del empleado (A, B o C): ");
        char categoria = scanner.nextLine().charAt(0);

        System.out.print("Ingrese la antigüedad del empleado en años: ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();

        // Cálculo del porcentaje de aumento según la antigüedad
        double porcentajeAumento = 0;

        if (antiguedad >= 1 && antiguedad <= 5) {
            porcentajeAumento = 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            porcentajeAumento = 0.1;
        } else if (antiguedad > 10) {
            porcentajeAumento = 0.3;
        }

        // Cálculo del plus por categoría
        double plusCategoria = 0;

        switch (categoria) {
            case 'A':
                plusCategoria = 1000;
                break;
            case 'B':
                plusCategoria = 2000;
                break;
            case 'C':
                plusCategoria = 3000;
                break;
        }

        // Cálculo del sueldo neto
        double sueldoNeto = sueldoBruto + (sueldoBruto * porcentajeAumento) + plusCategoria;

        // Impresión del resultado
        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);

        scanner.close();
    }
}
