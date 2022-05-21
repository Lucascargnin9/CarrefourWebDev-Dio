package Debugging;

import java.util.Scanner;

public class CalculadoradeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] alunos ={"Camila","Lucas","Bruna","Pedro"};

        int media = calculaMediaDaTurma(alunos,scan);

        System.out.println("Media da turma %d"+ media);
    }

    public static int calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        int soma =0;
        for(String aluno:alunos){
            System.out.println("Nota do aluno %s: "+aluno);
            int nota = scanner.nextInt();
            soma = soma+nota;
        }
        return soma/alunos.length;
    }

}
