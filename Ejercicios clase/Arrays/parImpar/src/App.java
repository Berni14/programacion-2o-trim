import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] listaNumeros = pedirArrayInt(sc);

        int[] listaSeparada = paresImpares(listaNumeros);

        System.out.printf("El array es: %s", Arrays.toString(listaSeparada));

        sc.close();

    }

    public static int[] paresImpares(int[] lista) {
        int contadorPares = 0;
        int contadorImpares = 0;

        int[] listaOrdenada = new int[lista.length];

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        int[] listaPares = new int[contadorPares];
        int[] listaImpares = new int[contadorImpares];
        int posicionPar = 0;
        int posicionImpar = 0;
        for(int i= 0; i< lista.length; i++)
        {
            if (lista[i] % 2 == 0) {
                listaPares[posicionPar]= lista[i];
                posicionPar++;
            } else {
                listaImpares[posicionImpar]= lista[i];
                posicionImpar++;
            }
        }

        for (int i = 0; i < listaPares.length; i++) {
            listaOrdenada[i] = listaPares[i];
        }
        for (int i = 0; i < listaImpares.length; i++) {
            listaOrdenada[listaPares.length + i] = listaImpares[i];
        }

        return listaOrdenada;
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
