import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("De que tamaño es el array");

        int tam = Integer.parseInt(sc.nextLine());
        int[] array = generarArray(tam);
        System.out.printf("El array %s, es : %s", Arrays.toString(array), Arrays.toString(numeroArray(array)));

        sc.close();
    }

    public static String[] numeroArray(int[] array) {
        String[] nombre = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez" };
        String[] resultado = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i] = nombre[array[i]];
        }

        return resultado;
    }

    public static int[] generarArray(int longitud) {
        int[] array = new int[longitud];
        Random rand = new Random();
        int pos = 0;

        while (pos < longitud) {
            int num = rand.nextInt(11);
            boolean repetido = false;
            int i = 0;

            while (i < pos && !repetido) {
                if (array[i] == num) {
                    repetido = true;
                }
                i++;
            }

            if (!repetido) {
                array[pos] = num;
                pos++;
            }
        }
        Arrays.sort(array);
        return array;
    }
}
