import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = crearMatrizAleatoria(sc);
        System.out.println("La matriz original:");
        imprimirMatriz(matriz);
        int[][] matrizRotada = rotarMatriz(matriz);
        System.out.println("Matriz rotada");
        imprimirMatriz(matrizRotada);

        sc.close();
    }

    public static int[][] rotarMatriz(int[][] matriz) {
        int[][] rotada = transponer(matriz);
        rotada = invertirColumnas(rotada);

        return rotada;
    }

    public static int[][] transponer(int[][] matriz) {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }

        }
        return transpuesta;
    }

    public static int[][] invertirColumnas(int[][] matrizTraspuesta) {
        int n = matrizTraspuesta.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temporal = matrizTraspuesta[i][j];
                matrizTraspuesta[i][j] = matrizTraspuesta[i][n - 1 - j];
                matrizTraspuesta[i][n - 1 - j] = temporal;
            }
        }
        return matrizTraspuesta;
    }

    public static int[][] crearMatrizAleatoria(Scanner sc) {
        System.out.print("Dime la filas: ");
        int filas = Integer.parseInt(sc.nextLine());
        System.out.print("Dime las columnas: ");
        int columnas = Integer.parseInt(sc.nextLine());
        System.out.print("Dime el rango máximo: ");
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

        public static void imprimirMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%3d", matriz[i][j]);
                }
                System.out.println();
            }
        }
}
