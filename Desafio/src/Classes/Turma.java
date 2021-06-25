package Classes;

public class Turma {
    Aluno aluno1, aluno2, aluno3;

    public Turma(Aluno aluno1, Aluno aluno2, Aluno aluno3){
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
        this.aluno3 = aluno3;
    }

    public double mediaT(){
        double medT = (aluno1.mediaA() + aluno2.mediaA() + aluno3.mediaA())/3;
        return medT;
    }

}
