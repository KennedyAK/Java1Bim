package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Esfera;

public class App {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Esfera numberOne;
        numberOne = new Esfera();
        System.out.println();

        System.out.print("Enter radius: ");
        numberOne.radius = ler.nextDouble();
        
        System.out.printf("Circumference: %.2f\n", numberOne.circumference());
        System.out.printf("volume: %.2f\n", numberOne.volume());
        System.out.printf("PI value: %.2f", numberOne.pi);
        System.out.println();
        ler.close();
    }
}