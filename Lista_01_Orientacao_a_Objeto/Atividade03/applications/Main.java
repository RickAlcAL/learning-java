package Lista_01_Orientacao_a_Objeto.Atividade03.applications;

import Lista_01_Orientacao_a_Objeto.Atividade03.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo calculoRetangulo = new Retangulo();

        System.out.println(calculoRetangulo.interacaoUsuario(sc));
    }
}
