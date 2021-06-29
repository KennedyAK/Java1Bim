package Program;

import Entities.Esfera;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Esfera number = new Esfera();
		
		System.out.print("\nEnter radius: ");
		double radius = ler.nextDouble();
		double c = number.circumference(radius);
		double v = number.volume(radius);


		System.out.printf("circumference: %.2f\n", c);
		System.out.printf("volume: %.2f\n", v);	
		System.out.printf("PI Value: %.2f", number.pi);
		System.out.println();
		ler.close();
	}
}