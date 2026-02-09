import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el texto para hacer el acronimo");
        String frase = sc.nextLine();

        StringTokenizer tokens = new StringTokenizer(frase);
        String acronimo = "";

        while (tokens.hasMoreTokens()) {
            String palabra = tokens.nextToken();
            if (palabra.length()>2) {
                if(!palabra.equals(palabra.toUpperCase())){
                    acronimo += palabra.substring(0,1).toUpperCase();
                }
            }
        }
        System.out.printf("El acronimo para %s es: %s", frase , acronimo);
        sc.close();
    }


}
