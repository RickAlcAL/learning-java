package Lista_01_Orientacao_a_Objeto.Atividade06.entities;

import java.util.Scanner;

public class Aluno {

    private String nomeAluno;
    private String matriculaAluno;
    private double notasAluno[] = new double[3];

    public String calcularMedia () {

        double soma = 0;

        for (int i = 0; i < notasAluno.length; i++){

            soma += notasAluno[i];

        }

        return String.format ("Sua média é: %.2f%n", soma / notasAluno.length) ;

    }

    public String verificarSituacao (Scanner sc) {

        System.out.println("Digite seu nome: ");
        this.nomeAluno = sc.nextLine();

        System.out.println("Digite sua matricula: ");
        this.matriculaAluno = sc.nextLine();

        int contadorNumeros = 0;
        int contadorLetras = 0;

        for (int i = 0; i < matriculaAluno.length(); i++){

            char caracteresAtual = matriculaAluno.charAt(i);

            if (Character.isDigit(caracteresAtual)){

                contadorNumeros++;

            } else if (Character.isLetter(caracteresAtual)) {

                contadorLetras++;

            }

        }
        if (contadorNumeros < 2 || contadorNumeros > 4){

            System.out.println("Sua matricula está incorreta\nNúmeros inconssistentes");
            sc.close();

        } else if (contadorLetras < 2 ||  contadorLetras > 4) {

            System.out.println("Sua matricula está incorreta\nCaracteres inconssistentes");
            sc.close();
        }
        for (int i = 0; i < 3; i++){

            System.out.println("Digite sua nota: " + i);
            notasAluno[i] = sc.nextDouble();

        }

        return ("Seu nome é:" + nomeAluno + "\nSua média é:" + calcularMedia());
    }
}
