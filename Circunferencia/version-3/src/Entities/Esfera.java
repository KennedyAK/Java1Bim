package Entities;

public class Esfera {

    public static final double pi = 3.14159;

    public static double circumference(double radius) {
        return pi * (radius * 2);
    }

    public static double volume(double radius) {
        return 4 * pi * Math.pow(radius, 3) / 3;
    }

}