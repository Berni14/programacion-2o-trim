import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] numeros = pedirArrayInt(sc);
        int[] inverso = invertir(numeros);
        System.out.printf("El array %s, es el array invertido de %s", Arrays.toString(inverso),
                Arrays.toString(numeros));
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

    public static int[] invertir(int[] arrayNormal) {
        int[] arrayInvertido = new int[arrayNormal.length];
        for (int i = 0; i <= arrayNormal.length - 1; i++) {
            arrayInvertido[i] = arrayNormal[(arrayNormal.length - 1) - i];
        }

        return arrayInvertido;
    }
}
