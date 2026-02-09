import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    
        
        int[] array = pedirArrayInt(sc);
        System.out.printf("El array %s %s", Arrays.toString(array), ordenado(array) ? " esta ordenado" : " esta desordenado");


    
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
    public static boolean ordenado (int[] array){
        for(int i = 0; i < array.length; i++){
            for (int j = i; j< array.length; j++){
                if (array[i]> array[j])
                    return false;
            }
        }
        return true;
    }
}
