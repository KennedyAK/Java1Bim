package Entities;

public class Cotacao {
    public double dollar;
    public double quantityDollar;
    public double quantityReal;
    public double iof = 0.06;

    public Cotacao(double dollar, double quantityDollar) {
        this.dollar = dollar;
        this.quantityDollar = quantityDollar;
    }

    public double conversao() {
         quantityReal = dollar * quantityDollar;
         iof *= quantityReal;
         return quantityReal += iof;
    }

}
