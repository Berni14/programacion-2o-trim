import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] array1 = pedirArrayInt(sc);
        int[] array2 = pedirArrayInt(sc);
        int[] arrayComun = interseccionar(array1, array2);

        System.out.printf("Los elementos que coinciden en el array1: %s, y el array2: %s son: array: %s",
                Arrays.toString(array1), Arrays.toString(array2), Arrays.toString(arrayComun));
        sc.close();
    }

    public static int[] interseccionar(int[] array1, int[] array2) {

        int tam = 0;
        if (array1.length > array2.length) {
            tam = array2.length;
        } else
            tam = array1.length;
        int[] arrayComun = new int[tam];
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    boolean existe = false;
                    arrayComun[k] = array1[i];
                    k++;
                    for(int l = 0; l< k; l++){
                        if(array1[i] == arrayComun[l]){
                            existe = true;
                        }
                    }
                    if (!existe) {
                        arrayComun[k] = array1[i];
                    }
                }
            }
        }
        if(k == arrayComun.length){
            return arrayComun;
        }
        else{
            int[] resultado = new int[k];
            for(int i = 0; i < k ; i++){
                resultado[i] = arrayComun[i];
            }
            return resultado;
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
