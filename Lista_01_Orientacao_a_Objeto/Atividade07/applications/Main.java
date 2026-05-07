package Lista_01_Orientacao_a_Objeto.Atividade07.applications;

import Lista_01_Orientacao_a_Objeto.Atividade07.entities.Carro;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Carro carrinho = new Carro();

        System.out.println(carrinho.menuUsuario(sc));
    }
}
