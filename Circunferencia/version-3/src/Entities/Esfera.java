package Entities;

public class Esfera {

    public double pi = 3.14159;
    public double radius;

    public double circumference() {
        double c = pi * (radius * 2);
        return c;
    }

    public double volume() {
        double v = 4 * pi * Math.pow(radius, 3) / 3;
        return v;
    }

}