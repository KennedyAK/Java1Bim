package Program;

import Entities.Esfera;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Esfera number;
		number = new Esfera();
		System.out.println();
		
		System.out.print("Enter radius: ");
		double radius = ler.nextDouble();

		number.circumference = number.pi * (radius*2);
        number.volume = 4 * number.pi * Math.pow(radius, 3) / 3;
		
		System.out.printf("circumference: %.2f\n", number.circumference);
		System.out.printf("volume: %.2f\n", number.volume);	
		System.out.printf("PI Value: %.2f", number.pi);
		System.out.println();
		ler.close();
	}
}