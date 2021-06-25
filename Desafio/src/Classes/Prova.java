package Classes;

public class Prova {
    private double notaP1, notaP2;

    public Prova(double notaP1, double notaP2){
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
    }

    public double getNotaP1(){
        return notaP1;
    }

    public void setNotaP1(double notaP1){
        this.notaP1 = notaP1;
    }

    public double getNotaP2(){
        return notaP1;
    }

    public void setNotaP2(double notaP2){
        this.notaP2 = notaP2;
    }

    public double notaTotal(){
        double notaT = notaP1 + notaP2;
        return notaT;
    }
}
