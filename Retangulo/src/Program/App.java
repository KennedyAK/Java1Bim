package Program;

import java.util.Scanner;
import Retangulo.Rectangle;

public class App {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        System.out.print("\nEnter width: ");
        double width = ler.nextDouble();
        System.out.print("Enter height: ");
        double height = ler.nextDouble();
        ler.close();

        Rectangle ret = new Rectangle(width, height);
        System.out.print("\nArea: " + ret.area());
        System.out.print("\nPerimeter: " + ret.perimeter());
        System.out.print("\nDiagonal: " + ret.diagonal() + "\n");
    }
}