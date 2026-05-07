package Lista_01_Orientacao_a_Objeto.Atividade04.entities;

import java.util.Scanner;

public class Produto {

    private String nomeDoProduto;
    private double precoDoProduto;
    private int quantidadeDeProduto;


    public String exibirResumo () {

        return "O nome do produto é: " + nomeDoProduto + "\nO preço do produto é: " + precoDoProduto + "\nA quantidade de produto é: " + quantidadeDeProduto;

    }

    public String interacaoUsuario (Scanner sc) {

        System.out.println("Digite o nome do seu produto: ");
        this.nomeDoProduto = sc.nextLine();

        System.out.println("Digite o preço do seu produto: ");
        this.precoDoProduto = sc.nextDouble();

        System.out.println("Digite a quantidade de produtos que obtem: ");
        this.quantidadeDeProduto = sc.nextInt();

        return exibirResumo();

    }
}
