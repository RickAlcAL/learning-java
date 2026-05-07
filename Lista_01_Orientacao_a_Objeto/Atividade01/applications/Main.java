package Lista_01_Orientacao_a_Objeto.Atividade01.applications;

import Lista_01_Orientacao_a_Objeto.Atividade01.entities.Lampada;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Lampada lampadazinha = new Lampada();

        String resultadoLampada = lampadazinha.estadoLampada();

        System.out.println(resultadoLampada);
    }
}
