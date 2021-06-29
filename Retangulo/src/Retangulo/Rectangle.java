package Retangulo;

public class Rectangle {
    public double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return this.width * this.height;
    }
    public double perimeter(){
        return 2.0 * (this.width + this.height);
    }

    public double diagonal(){
         double dig = Math.pow(this.width, 2) + Math.pow(this.height, 2);
         return Math.sqrt(dig);
    }
}
