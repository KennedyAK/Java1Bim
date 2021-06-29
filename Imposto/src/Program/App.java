package Program;

import java.util.Scanner;
import Imposto.Imposto;

public class App {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        System.out.print("\nName: ");
        String name = ler.nextLine();
        System.out.print("Groos salary: ");
        double salary = ler.nextDouble();
        System.out.print("Tax: ");
        double tax = ler.nextDouble();

        Imposto ficha = new Imposto(name, salary, tax);
        System.out.print(ficha);

        System.out.print("\nWhich percentage to increase salary? ");
        double percentage = ler.nextDouble();
        ficha.increaseSalary(percentage);
        System.out.print(ficha);
        ler.close();
    }
}