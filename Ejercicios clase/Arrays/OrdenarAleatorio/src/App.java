import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿De qué longitud va a ser el array? ");
        int longitud = sc.nextInt();

        int[] aleatorio = generarArray(longitud);
        

        System.out.printf("Array aleatorio: %s Array ordenado: %s", Arrays.toString(aleatorio), Arrays.toString(ordenarArray(aleatorio)));


        sc.close();
    }
    public static int[] ordenarArray(int[] arrayAleatorio){
        Arrays.sort(arrayAleatorio);
        return arrayAleatorio;


        

    }

    public static int[] generarArray(int longitud) {
        int[] array = new int[longitud];
        Random rand = new Random();
        int pos = 0;

        while (pos < longitud) {
            int num = rand.nextInt(100);
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
        return array;
    }
    
}
