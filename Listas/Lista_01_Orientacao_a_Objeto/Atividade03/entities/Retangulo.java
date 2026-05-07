package Lista_01_Orientacao_a_Objeto.Atividade03.entities;

import java.util.Scanner;

public class Retangulo {

    public double base;
    public double altura;

    public String calcularArea () {

        return "O resultado do calculo é: " + base * altura;

    }

    public String interacaoUsuario (Scanner sc) {

        System.out.println("Insira a base do retangulo: ");
        this.base = sc.nextDouble();

        System.out.println("Insira a altura do retangulo: ");
        this.altura = sc.nextDouble();

        return calcularArea();
    }
}
