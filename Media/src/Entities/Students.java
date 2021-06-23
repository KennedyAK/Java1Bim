package Entities;

public class Students {
    public String name;
    public double med1;
    public double med2;
    public double med3;

    public double mediaFinal() {
        double med = (med1 + med2 + med3);
        return med;
    }

    public void condicao() {
        if (mediaFinal() >= 60) {
            System.out.println("Pass");
        } else {
            double cond = 60 - mediaFinal();
            System.out.println("Failed");
            System.out.println("Missing " + cond + " Points");
        }
    }

}