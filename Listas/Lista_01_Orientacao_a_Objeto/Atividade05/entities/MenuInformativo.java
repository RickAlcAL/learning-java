package Lista_01_Orientacao_a_Objeto.Atividade05.entities;

import java.util.Scanner;

public class MenuInformativo {
    public String menuInformativoBancario (Scanner sc) {
        ContaBancaria dadosBancarios = new ContaBancaria();

        int opcao = 0;
        String mensagemFinalSistema = "Sistema encerrado";

        do {

            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1. Exibir Titular");
            System.out.println("2. Ver Saldo");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Cadastrar Titular");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println(dadosBancarios.nomeTitularConta());
                    break;

                case 2:

                    System.out.println(dadosBancarios.saldoConta());
                    break;

                case 3:

                    System.out.println(dadosBancarios.depositarValor(sc));
                    break;

                case 4:

                    System.out.println(dadosBancarios.sacarValor(sc));
                    break;

                case 5:

                    System.out.println(dadosBancarios.cadastroTitularConta(sc));
                    break;

                case 6:

                    System.out.println("Encerrando sistema...\nAté a proxima !!!");
                    break;

                default:

                    System.out.println("Opção inválida! Tente novamente.");

            }
        } while (opcao != 6);

        return mensagemFinalSistema;

    }
}
