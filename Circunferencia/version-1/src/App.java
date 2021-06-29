
import java.util.Locale;
import java.util.Scanner;

public class App {
	public static final double pi = 3.14159;

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("\nEnter radius: ");
		double radius = ler.nextDouble();
		double Circumference = circumference(radius);
		double volume = volume(radius);
		
		System.out.printf("Circumference: %.2f\n", Circumference);
		System.out.printf("volume: %.2f\n", volume);	
		System.out.printf("PI Value: %.2f\n", pi);
		ler.close();
	}

	public static double circumference(double radius) {
		return pi * (radius * 2);
	}

	public static double volume(double radius) {
		return 4.0 * pi * (radius * radius * radius) / 3;
	}

}