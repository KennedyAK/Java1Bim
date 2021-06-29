package Program;

import java.util.Scanner;
import entities.Triangulo;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Triangulo one = new Triangulo();
        System.out.println("\nTriangle ONE");
        System.out.print("Enter value lado A: ");
        one.lado1 = ler.nextDouble();
        System.out.print("Enter value lado B: ");
        one.lado2 = ler.nextDouble();
        System.out.print("Enter value lado C: ");
        one.lado3 = ler.nextDouble();

        Triangulo two = new Triangulo();
        System.out.println("\nTriangle TWO");
        System.out.print("Enter value lado A: ");
        two.lado1 = ler.nextDouble();
        System.out.print("Enter value lado B: ");
        two.lado2 = ler.nextDouble();
        System.out.print("Enter value lado C: ");
        two.lado3 = ler.nextDouble();
        ler.close();

        System.out.printf("\nTriangle ONE area: %.4f%n", one.areaT());
        System.out.printf("Triangle TWO area: %.4f%n", two.areaT());

        if(one.areaT() > two.areaT()){
            System.out.println("\nLarger area: ONE");
        }else{
            System.out.println("\nLarger area: TWO");
        }
    }
}