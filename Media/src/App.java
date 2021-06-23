import java.util.Scanner;
import Entities.Students;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Students alunoOne;
        alunoOne = new Students();
        System.out.println();

        System.out.print("Name: ");
        alunoOne.name = ler.nextLine();
        System.out.print("Media 1° - Trimestre: ");
        alunoOne.med1 = ler.nextDouble();
        System.out.print("Media 2° - Trimestre: ");
        alunoOne.med2 = ler.nextDouble();
        System.out.print("Media 3° - Trimestre: ");
        alunoOne.med3 = ler.nextDouble();
        System.out.println();

        System.out.println("Final Grade = " + alunoOne.mediaFinal());
        alunoOne.condicao();
        ler.close();
    }

}