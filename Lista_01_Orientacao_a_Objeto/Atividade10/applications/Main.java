package Lista_01_Orientacao_a_Objeto.Atividade10.applications;

import Lista_01_Orientacao_a_Objeto.Atividade10.entities.Termometro;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Termometro calculoTemperatura = new Termometro();

        System.out.println("\n----------------------------");
        System.out.printf("RESULTADO FINAL: %.2f unidades%n", calculoTemperatura.menuUsuario(sc));
        System.out.println("----------------------------");
    }
}
