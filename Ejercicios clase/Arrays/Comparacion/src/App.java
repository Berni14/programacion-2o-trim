import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array1 = pedirArrayInt(sc);
        int[] array2 = pedirArrayInt(sc);

        if (comparacion(array1, array2))
            System.out.println("Los arrays son iguales");
        else
            System.out.println("Los arrays son distintos");
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

    public static boolean comparacion(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        boolean[] encontrados = new boolean[array1.length];
        for (int i = 0; i < array1.length; i++) {
            boolean igual = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    if(encontrados[j])
                        return false;
                    else
                        encontrados[j] = true;
                }
            }
            if (!igual) {
                    return false;
                }
        }
        return true;
    }
}
