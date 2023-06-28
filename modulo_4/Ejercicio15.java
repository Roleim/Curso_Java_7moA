public class Ejercicio15 {
    public static void main(String[] args) {
        char claseAuto = 'b'; // Puedes cambiar el valor de claseAuto según tus necesidades

        System.out.println("Características del auto:");

        switch (claseAuto) {
            case 'a':
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                break;
            case 'b':
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                break;
            case 'c':
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                System.out.println("- Airbag");
                break;
            default:
                System.out.println("Clase de auto no válida");
                break;
        }
    }
}
