package Lista_01_Orientacao_a_Objeto.Atividade05.entities;

import java.util.Scanner;

public class ContaBancaria {

    private String titularDaConta;
    private double saldoDaContaDoTitular;

    public String saldoConta() {

        if (saldoDaContaDoTitular <= 0) {

            return "Saldo zerado. Execute um depósito.";

        } else {

            return String.format("Seu saldo atual é de: R$ %.2f", saldoDaContaDoTitular);

        }
    }

    public String depositarValor(Scanner sc) {

        System.out.println("Qual o valor que deseja depositar?");
        double valor = sc.nextDouble();

        if (valor > 0) {

            this.saldoDaContaDoTitular += valor;
            return "O valor de R$ " + valor + " foi depositado com sucesso!";

        }

        return "Valor de depósito inválido.";

    }

    public String sacarValor(Scanner sc) {

        System.out.println("Qual o valor que deseja sacar?");
        double valor = sc.nextDouble();

        if (valor > saldoDaContaDoTitular) {

            return "Você não possui saldo suficiente. Tente um depósito.";

        } else if (valor <= 0) {

            return "Valor de saque inválido.";

        } else {

            this.saldoDaContaDoTitular -= valor;
            return "Saque efetuado com sucesso!!!\nSeu saldo atual é de: R$ " + saldoDaContaDoTitular;

        }
    }

    public String nomeTitularConta() {

        if (titularDaConta == null || titularDaConta.isEmpty()) {

            return "Nenhum titular cadastrado.";

        }

        return "Seu nome de titular é: " + titularDaConta;

    }

    public String cadastroTitularConta(Scanner sc) {

        if (titularDaConta == null || titularDaConta.isEmpty()) {

            System.out.println("Iniciando novo cadastro de Titular");
            System.out.println(" ================================= ");
            System.out.print("Qual o seu nome? ");
            sc.nextLine(); // Limpeza de buffer
            this.titularDaConta = sc.nextLine();
            return "Titular cadastrado com sucesso!";

        } else {

            return "Você já possui um cadastro: " + titularDaConta;

        }
    }
}