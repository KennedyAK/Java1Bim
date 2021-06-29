package Imposto;

public class Imposto {
    public double salary, tax;
    public String name;

    public Imposto(String name, double salary, double tax){
        this.name = name;
        this.salary = salary;
        this.tax = tax;
    }

    public double netSalary(){
        return salary - tax;
    }

    public void increaseSalary(double percentage){
        percentage /= 100;
        percentage *= salary;
        salary += percentage;
    }

    public String toString(){
        return "\nEmproyee: " + name + ", $ " + netSalary() + "\n";
    }
}
