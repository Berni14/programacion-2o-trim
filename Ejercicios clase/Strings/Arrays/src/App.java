import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas ventas has hecho hoy:");
        int ventasTotales = Integer.parseInt(sc.nextLine());

        int ventas[] = new int[ventasTotales];

        int suma = 0;

        for (int i = 0; i < ventasTotales; i++) {
            System.out.printf("\nEl precio de la venta %d es: ", i + 1);
            ventas[i] = Integer.parseInt(sc.nextLine());
            suma += ventas[i];
        }
        System.out.printf("\nLa suma de %d ventas ha sido de %d € ", ventasTotales, suma);

        sc.close();
    }
}
