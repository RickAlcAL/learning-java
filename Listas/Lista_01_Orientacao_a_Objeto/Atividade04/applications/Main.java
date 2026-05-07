package Lista_01_Orientacao_a_Objeto.Atividade04.applications;

import Lista_01_Orientacao_a_Objeto.Atividade04.entities.Produto;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Produto products = new Produto();

        System.out.println(products.interacaoUsuario(sc));


    }
}
