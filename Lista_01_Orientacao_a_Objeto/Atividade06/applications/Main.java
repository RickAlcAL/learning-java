package Lista_01_Orientacao_a_Objeto.Atividade06.applications;

import Lista_01_Orientacao_a_Objeto.Atividade06.entities.Aluno;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Aluno calculoMediaNotas = new Aluno();
        System.out.println(calculoMediaNotas.verificarSituacao(sc));
    }
}
