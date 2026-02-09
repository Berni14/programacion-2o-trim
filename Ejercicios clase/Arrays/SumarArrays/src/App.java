import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array = pedirArrayInt(sc);
        sumaArrays(array);
        sc.close();
    }

    public static void sumaArrays(int[] array) {
        int tamPar = 0;
        int tamImp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                tamPar++;
            else
                tamImp++;
        }
        int[] arrayImpar = new int[tamImp];
        int[] arrayPar = new int[tamPar];
        int rPar = 0;
        int rImpar = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPar[rPar] = array[i];
                rPar++;
            } else {
                arrayImpar[rImpar] = array[i];
                rImpar++;
            }
        }
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int i = 0; i < arrayImpar.length; i++)
            sumaImpares += arrayImpar[i];
        for (int i = 0; i < arrayPar.length; i++)
            sumaPares += arrayPar[i];
        System.out.printf("La suma del array de pares: %s = %d, y las de impares: %s = %d", Arrays.toString(arrayPar),
                sumaPares, Arrays.toString(arrayImpar), sumaImpares);

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
/**
class Sumas{
    private int pares = 0;
    private int impares = 0;

    hago getters y setters


}
public static Sumas sumarPI(int[] array)

    sumas sum = new Sumas();
    for (int i = 0; i < array.length; i++){
        if(array[i] % 2 == 0){
            sum.setPares(sum.getPares() + array[i]);
        else
            sum.setImpares(sum.getImpares()+ array[i])
    }




**/