package Classes;

public class Prova {
    public double notaP1, notaP2;

    public Prova(double notaP1, double notaP2){
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
    }

    public double notaTotal(){
        double notaT = notaP1 + notaP2;
        return notaT;
    }
}
