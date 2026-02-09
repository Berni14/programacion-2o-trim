import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        // Número de caracteres
        int caracteres = frase.length();

        // Número de palabras
        String fraseLimpia = frase.trim();
        int palabras = 0;

        if (!fraseLimpia.isEmpty()) {
            String[] partes = fraseLimpia.split("\\s+");
            palabras = partes.length;
        }

        // Frase en mayúsculas
        String mayusculas = frase.toUpperCase();

        // Frase invertida
        String invertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            invertida += frase.charAt(i);
        }

        // Mostrar resultados
        System.out.println("\nRESULTADOS:");
        System.out.println("Caracteres: " + caracteres);
        System.out.println("Palabras: " + palabras);
        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Invertida: " + invertida);

        sc.close();
    }
}
