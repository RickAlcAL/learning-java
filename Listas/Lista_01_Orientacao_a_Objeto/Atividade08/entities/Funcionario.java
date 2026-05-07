package Lista_01_Orientacao_a_Objeto.Atividade08.entities;

import java.util.Scanner;

public class Funcionario {

    private String nomeFuncionario;
    private String sobrenomeFuncionario;
    private double salarioFuncionario;



    public String darAumento () {

        double porcentagem = 10.0;
        double aumento = salarioFuncionario * (porcentagem / 100);
        double resultado = salarioFuncionario + aumento;

        return "Seu aumento é de 10% !!! Seu salario agora é:" + resultado;
    }

    public String menuUsuario (Scanner sc) {

        System.out.println("Qual seu nome: ");
        this.nomeFuncionario = sc.nextLine();

        System.out.println("Qual seu sobrenome: ");
        this.sobrenomeFuncionario = sc.nextLine();

        System.out.println("Qual seu salario bruto: ");
        this.salarioFuncionario = sc.nextDouble();

        System.out.println("Seu nome é:" +nomeFuncionario+ sobrenomeFuncionario + "\nSeu salario é: " +salarioFuncionario);

        return darAumento();
    }
}
