import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        calculoTemperaturas(sc);

        sc.close();
    }

    public static void calculoTemperaturas(Scanner sc) {

        int temperaturaDias[] = new int[7];
        int temperaturaMayor = 1;
        int temperaturaMenor = 1;
        int temperaturaSuma = 0;
        int temperaturaMedia = 0;

        for (int i = 0; i < 7; i++) {
            System.out.printf("\nIngresa la temperatura del dia %d: ", i + 1);

            temperaturaDias[i] = Integer.parseInt(sc.nextLine());

            if (temperaturaDias[i] > temperaturaMayor) {
                temperaturaMayor = temperaturaDias[i];
            }
            if (temperaturaDias[i] < temperaturaMenor) {
                temperaturaMenor = temperaturaDias[i];
            }

            temperaturaSuma += temperaturaDias[i];
        }

        temperaturaMedia = temperaturaSuma / 7;
        
        System.out.printf("\n La media de temperatura ha sido de %d, la mayor temperatura de %d y la menor de %d",
                temperaturaMedia, temperaturaMayor, temperaturaMenor);

    }
}
