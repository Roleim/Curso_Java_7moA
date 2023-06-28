import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría (a, b o c): ");
        char categoria = scanner.nextLine().charAt(0);

        switch (categoria) {
            case 'a':
                System.out.println("Hijo");
                break;
            case 'b':
                System.out.println("Padres");
                break;
            case 'c':
                System.out.println("Abuelos");
                break;
            default:
                System.out.println("Te dije que  elijas una categoria a, b, o c");
                break;
        }
    }
}
