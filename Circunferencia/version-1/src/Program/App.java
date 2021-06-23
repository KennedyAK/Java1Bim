package Program;

import java.util.Locale;
import java.util.Scanner;

public class App {	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println();

		System.out.print("Enter radius: ");
		double radius = ler.nextDouble();
		
		double pi = 3.14159;
		double Circumference = pi * (radius*2);
		
		double volume = 4.0 * pi * (radius * radius * radius)/3;
		
		System.out.printf("Circumference: %.2f\n", Circumference);
		System.out.printf("volume: %.2f\n", volume);	
		System.out.printf("PI Value: %.2f\n", pi);
		System.out.println();
		ler.close();
	}

}