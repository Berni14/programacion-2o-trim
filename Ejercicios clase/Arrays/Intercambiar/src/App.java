import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] numeros = pedirArrayInt(sc);
        System.out.printf("El array %s con los valores maximos y minimos intercambiado es: %s", Arrays.toString(numeros), Arrays.toString(intercambiar(numeros)));
        sc.close();
    }

    public static int[] intercambiar(int[] array) {
        int mayor = array[0];
        int menor = array[0];
        int posMax = 0;
        int posMin = 0;

        for (int i = 0; i < array.length; i++) {
            if (mayor < array[i]){
                mayor = array[i];
                posMax = i;
            }
            if (menor > array[i]){
                menor = array[i];
                posMin = i;
            }
        }
        array[posMax] = menor;
        array[posMin] = mayor;

        return array;

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
