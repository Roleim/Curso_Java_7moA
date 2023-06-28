import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        while (count < 10) {
            char categoria;
            double sueldo;

            // Generar categoría aleatoria
            int categoriaIndex = random.nextInt(3);
            if (categoriaIndex == 0) {
                categoria = 'A';
            } else if (categoriaIndex == 1) {
                categoria = 'B';
            } else {
                categoria = 'C';
            }

            // Generar sueldo aleatorio
            sueldo = random.nextDouble() * 10000; // Rango de sueldo: 0 a 10000

            // Verificar que los valores sean válidos
            if (categoria == 'A' || categoria == 'B' || categoria == 'C') {
                if (sueldo > 0) {
                    // Imprimir empleado generado
                    System.out.println("Empleado " + (count + 1));
                    System.out.println("Categoría: " + categoria);
                    System.out.println("Sueldo: " + sueldo);
                    System.out.println("-------------------------");
                    count++;
                }
            }
        }
    }
}
