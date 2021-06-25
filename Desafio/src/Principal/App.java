package Principal;

import Classes.*;

public class App {

    public static void main(String[] args) {
        Aluno aluno1;
        Prova aluno1P1;
        Prova aluno1P2;
        double a1nota1P1 = 4.0;
        double a1nota2P1 = 2.5;
        double a1nota1P2 = 1.0;
        double a1nota2P2 = 7.0;

        aluno1P1 = new Prova(a1nota1P1, a1nota2P1);
        aluno1P2 = new Prova(a1nota1P2, a1nota2P2);
        aluno1 = new Aluno(aluno1P1, aluno1P2);

        Aluno aluno2;
        Prova aluno2P1;
        Prova aluno2P2;
        double a2nota1P1 = 6.5;
        double a2nota2P1 = 3.5;
        double a2nota1P2 = 0.0;
        double a2nota2P2 = 3.5;

        aluno2P1 = new Prova(a2nota1P1, a2nota2P1);
        aluno2P2 = new Prova(a2nota1P2, a2nota2P2);
        aluno2 = new Aluno(aluno2P1, aluno2P2);

        Aluno aluno3;
        Prova aluno3P1;
        Prova aluno3P2;
        double a3nota1P1 = 5.0;
        double a3nota2P1 = 4.0;
        double a3nota1P2 = 6.0;
        double a3nota2P2 = 1.5;

        aluno3P1 = new Prova(a3nota1P1, a3nota2P1);
        aluno3P2 = new Prova(a3nota1P2, a3nota2P2);
        aluno3 = new Aluno(aluno3P1, aluno3P2);

        Turma turma;
        turma = new Turma(aluno1, aluno2, aluno3);

        System.out.println();
        System.out.printf("Media Turma: %.2f\n", turma.mediaT());
        System.out.printf("Media Aluno1: %.2f\n", aluno1.mediaA());
        System.out.printf("Media Aluno2: %.2f\n", aluno2.mediaA());
        System.out.printf("Media Aluno2: %.2f\n", aluno3.mediaA());
    }

}