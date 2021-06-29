package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Esfera;

public class App {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("\nEnter radius: ");
        double radius = ler.nextDouble();
        double circumference = Esfera.circumference(radius);
        double volume = Esfera.volume(radius);

        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("volume: %.2f\n", volume);
        System.out.printf("PI value: %.2f", Esfera.pi);
        ler.close();
    }
}