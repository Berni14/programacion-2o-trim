import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int[] array = pedirArrayInt(sc);
        System.out.println(Arrays.toString(mitades(array)));

        sc.close();
    }

    public static int[] mitades(int[] array) {
        int[] arrayMitad = new int[array.length];
        int j = 0;
        for (int i = array.length / 2; i < array.length; i++) {
            arrayMitad[j] = array[i];
            j++;
        }
        for (int i = 0; i < array.length / 2; i++) {
            arrayMitad[j] = array[i];
            j++;
        }
        return arrayMitad;
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
 