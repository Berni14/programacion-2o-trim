import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Dado un array, crea un nuevo array duplicando su tamaño, copiando los valores originales y rellenando los espacios 
// restantes con la media de los elementos adyacentes, en el último elemento poner la suma de todos los elementos del array original.
//Por ejemplo:
//[0, 1, 2, 3] ---> [0, 0.5, 1, 1.5, 2, 2.5, 3, 6]

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el tamaño del array");
        int tam = Integer.parseInt(sc.nextLine());
        int[] array = generarArray(tam);
        System.out.printf("El array: %s se expande a %s: ", Arrays.toString(array), Arrays.toString(expandir(array)));

        sc.close();
    }

    public static double[] expandir(int[] array) {
        double[] arrayDuplicado = new double[array.length * 2];
        int j = 0;
        int suma = 0;
        for (int i = 0; i < arrayDuplicado.length; i++) {
            if (i == 0 || i % 2 == 0) {
                arrayDuplicado[i] = array[j];
                j++;
            } else {
                arrayDuplicado[i] = array[j - 1] + 0.5;
                if (i == arrayDuplicado.length - 1) {
                    for (int k = 0; k < array.length; k++) {
                        suma += array[k];
                    }
                    arrayDuplicado[i] = suma;
                }
            }
        }
        return arrayDuplicado;
    }

    public static int[] generarArray(int longitud) {
        int[] array = new int[longitud];
        Random rand = new Random();
        int pos = 0;

        while (pos < longitud) {
            int num = rand.nextInt(longitud);
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
