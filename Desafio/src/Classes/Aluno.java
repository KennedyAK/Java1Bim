package Classes;

public class Aluno {

    Prova prova1, prova2;

    public Aluno(Prova prova1, Prova prova2) {
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public double mediaA() {
        double medA = (prova1.notaTotal() + prova2.notaTotal())/2;
        return medA;
    }

}
