package Lista_01_Orientacao_a_Objeto.Atividade09.entities;

import java.util.Scanner;

public class Agenda {

    public Contato[] contatos = new Contato[5];

    public String menuContato (Scanner sc) {

        for (int i = 0; i < contatos.length; i++){

            contatos[i] = new Contato();

            System.out.println("Digite seu nome: ");
            contatos[i].nomeContatoUsuario = sc.nextLine();

            System.out.println("Digite seu numero de telefone: ");
            contatos[i].telefoneUsuario = sc.nextLine();

            int contadorNumeros = 0;
            int contadorLetras = 0;

            for (int y = 0; y < contatos[i].telefoneUsuario.length(); y++) {

                char verificacao = contatos[i].telefoneUsuario.charAt(y);

                if (Character.isDigit(verificacao)) {

                    contadorNumeros++;

                } else if (Character.isLetter(verificacao)) {

                    contadorLetras++;

                }
            }

            if (contadorLetras > 0) {

                System.out.println("Erro: Letras detectadas no telefone!");

            }

            if (contadorNumeros < 11) {

                System.out.println("Telefone incorreto: Falta de números.");

            } else if (contadorNumeros > 11) {

                System.out.println("Erro: Números demais.");

            }
        }

        for (Contato c : contatos) {

            if (c != null) {

                System.out.println("Nome cadastrado: " + c.nomeContatoUsuario + "\n Numero de telefone: " + c.telefoneUsuario);

            }
        }

        String mensagemfinal = "Seu nome e seu numero foram adicionados com sucesso!";
        return mensagemfinal;
    }

}
