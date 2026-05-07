package Lista_01_Orientacao_a_Objeto.Atividade05.applications;

import Lista_01_Orientacao_a_Objeto.Atividade05.entities.ContaBancaria;
import Lista_01_Orientacao_a_Objeto.Atividade05.entities.MenuInformativo;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        ContaBancaria calculosBancarios = new ContaBancaria();
        MenuInformativo menuUsuario = new MenuInformativo();

        System.out.println(menuUsuario.menuInformativoBancario(sc));
    }
}
