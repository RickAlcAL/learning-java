package Lista_01_Orientacao_a_Objeto.Atividade08.applications;

import Lista_01_Orientacao_a_Objeto.Atividade08.entities.Funcionario;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Funcionario salarioAumentoCalculo = new Funcionario();

        System.out.println(salarioAumentoCalculo.menuUsuario(sc));
    }
}
