package Lista_01_Orientacao_a_Objeto.Atividade07.entities;

import java.util.Scanner;

public class Carro {

    private String modeloCarro;
    private String marcaCarro;
    private int somaVelocidade;

    public void acelerador () {

        somaVelocidade += 10;

    }

    public void freio () {

        if (somaVelocidade > 0){

            somaVelocidade -=10;

        }
    }

    public String menuUsuario (Scanner sc){

        String mensagemFinal = "Sistema Finalzado...";

        char resp ;

            System.out.println("Qual o modelo do seu carro ?");
            this.modeloCarro = sc.nextLine();

            System.out.println("Qual a marca do seu carro ?");
            this.marcaCarro = sc.nextLine();


            do {
                System.out.println("O modelo do seu carro é:" + modeloCarro + "\nA marca é:" + marcaCarro + "\nSua velocidade atual é:" + somaVelocidade);

                System.out.println("Deseja acelerar ou freiar ?");
                System.out.println("1. Acelerar");
                System.out.println("2. Freiar");
                System.out.println("3. Sair");
                resp = sc.next().charAt(0);

                if (resp == '1'){

                    acelerador();

                }else if (resp == '2'){

                    freio();

                }

            }while (resp != 3);

            return mensagemFinal;
    }
}
