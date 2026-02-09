import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("---PRIMER ARRAY---");
        int[] array1 = pedirArrayInt(sc);
        System.out.println("---SEGUNDO ARRAY---");
        int[] array2 = pedirArrayInt(sc);


        int[] fusionado = new int[array1.length+ array2.length];

        for (int i = 0; i < array1.length; i++) {
            fusionado[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            fusionado[array1.length+i] =array2[i];
        }
        System.out.printf("El array %s y el array %s, fusionados seran %s", Arrays.toString(array1),Arrays.toString(array2),Arrays.toString(fusionado));

        sc.close();
    }

    
}
