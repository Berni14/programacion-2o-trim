import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array1 = pedirArrayInt(sc);
        int[] array2 = pedirArrayInt(sc);
        int[] arrayIntercalado = intercalar(array1, array2);
        System.out.printf("El array intercalado de %s y %s es: %s", Arrays.toString(array1), Arrays.toString(array2),
                Arrays.toString(arrayIntercalado));

        sc.close();
    }

    public static int[] intercalar(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return null;
        } else {
            int[] arrayIntercalado = new int[array1.length + array2.length];
            for (int i = 0; i < arrayIntercalado.length; i++) {
                if (i % 2 == 0) {
                    arrayIntercalado[i] = array1[i / 2];
                } else {
                    arrayIntercalado[i] = array2[i / 2];
                }
            }
            return arrayIntercalado;
        }
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
}
