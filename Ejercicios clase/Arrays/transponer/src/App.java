import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = crearMatrizAleatoria(sc);
        System.out.println("Matriz original");
        imprimirMatriz(matriz);
        System.out.println("Matriz traspuesta:");
        imprimirMatriz(trasponerMatriz(matriz));
        sc.close();
    }
    public static int[][] trasponerMatriz(int[][] matriz){
        int[][] matrizTraspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for(int j = 0; j< matriz[0].length; j++)
            matrizTraspuesta[j][i] = matriz[i][j];
        }
        return matrizTraspuesta;
    }
    public static int[][] crearMatrizAleatoria(Scanner sc){
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

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
