package Lista_01_Orientacao_a_Objeto.Atividade02.applications;

import Lista_01_Orientacao_a_Objeto.Atividade02.entities.Cachorro;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Cachorro cachorrito = new Cachorro();

        System.out.println(cachorrito.menuDog(sc));

        System.out.println(cachorrito.menuDog02(sc));

    }
}
