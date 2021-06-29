package Program;

import java.util.Scanner;

import Entities.Cotacao;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("\nWhat is the dollar price? $");
        double dollar = ler.nextDouble();
        System.out.print("How many dollars will be bought? $");
        double quantityDollar = ler.nextDouble();
        ler.close();

        Cotacao cota = new Cotacao(dollar, quantityDollar);

        System.out.printf("Amount to be paid in reais: R$%.2f%n", cota.conversao());
    }
}
