import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = crearMatrizAleatoria(sc);
        int diagonalP = diagonalPrincipal(matriz);
        int diagonalS = diagonalSecundaria(matriz);

        imprimirMatriz(matriz);

        System.out.printf("La suma de la diagonal principal es: %d", diagonalP);
        System.out.printf("\nLa suma de la diagonal secundaria es: %d", diagonalS);

        sc.close();
    }

    public static int diagonalPrincipal(int[][] array) {
        int sumaDP = 0;

        for (int i = 0; i < array.length; i++) {
            sumaDP += array[i][i];
        }
        return sumaDP;
    }

    public static int diagonalSecundaria(int[][] array) {
        int sumaDS = 0;
        for (int i = 0; i < array.length; i++) {
            sumaDS += array[i][array.length - 1 - i];
        }
        return sumaDS;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generarArray(int longi, int longj) {
        int[][] array = new int[longi][longj];
        Random rand = new Random();
        for (int i = 0; i < longi; i++) {
            for (int j = 0; j < longj; j++) {
                int num = rand.nextInt(11);
                array[i][j] = num;
            }
        }
        return array;
    }

    public static int[][] crearMatrizAleatoria(Scanner sc) {
        System.out.print("Dime las filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Dime las columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());
        System.out.println("Dime el rango maximo: ");
        int rango = Integer.parseInt(sc.nextLine());
        Random rand = new Random();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(rango);
            }
        }
        return matriz;
    }
}
