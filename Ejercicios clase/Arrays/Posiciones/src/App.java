import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arrayPrincipal = pedirArrayInt(sc);
        System.out.println(
                "El siguiente array sera de tamaño maximo el del array principal, ademas los valores del mismo no podran superar la longitud del array anterior");
        int[] arrayPosiciones = pedirArrayInt(sc);

        int[] arrayOrdenado = cambiarPosicion(arrayPrincipal, arrayPosiciones);

        System.out.println(Arrays.toString(arrayOrdenado));

        sc.close();

    }

    public static int[] cambiarPosicion(int[] arrayPrincipal, int[] arrayIndice) {

        int[] arrayOrdenado = new int[arrayIndice.length];

        for (int i = 0; i < arrayIndice.length; i++) {
            if ((arrayIndice[i]) >= 0 && (arrayIndice[i]) < arrayPrincipal.length) {
                arrayOrdenado[arrayIndice[i]] = arrayPrincipal[i];

            }
        }
        return arrayOrdenado;
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
