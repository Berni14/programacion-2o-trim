import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe la frase: ");
        String texto = sc.nextLine();

        texto = texto.trim().replace("a", "@");
        
        StringTokenizer tokens = new StringTokenizer(texto);

        String frase = "";

        while (tokens.hasMoreTokens()) {
            String palabra = tokens.nextToken();
            frase = palabra + " " + frase;
        }
        System.out.println(frase);
        sc.close();
    }
}
