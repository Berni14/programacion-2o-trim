import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = pedirArrayInt(sc);

        System.out.print("\n Quieres rotarlo hacia la derecha o a la izquierda: (i/d)");
        boolean sentido = sc.nextLine().equalsIgnoreCase("d");

        System.out.print("\n Cuantas posiciones quieres desplazarlos: ");
        int posiciones = Integer.parseInt(sc.nextLine());

        int[] rotado = rotarArray(array, posiciones, sentido);

        System.out.printf("El array %s es el rotado de %s ", Arrays.toString(array), Arrays.toString(rotado));
        sc.close();
    }

    public static int[] pedirArrayInt(Scanner sc) {
        System.out.print("Dime el numero de datos que me vas a dar: ");
        int numDatos = Integer.parseInt(sc.nextLine());

        int[] numeros = new int[numDatos];
        for (int i = 0; i < numDatos; i++) {
            System.out.println("Dime el numero " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        return numeros;
    }

    public static int[] rotarArray(int[] array, int posiciones, boolean sentido) {
        int[] rotado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (sentido) {
                if (i + posiciones < array.length) {
                    rotado[i + posiciones] = array[i];
                }else{
                    rotado[i + posiciones - array.length] = array[i];
                }
            } else {
                if (i - posiciones >= 0) {
                    rotado[i - posiciones] = array[i];
                }else{
                    rotado[i - posiciones + array.length] = array[i];
                }
            }
        }
        return rotado;
    }
}
