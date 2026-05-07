package Lista_01_Orientacao_a_Objeto.Atividade10.entities;

import java.util.Scanner;

public class Termometro {

    private double temperaturaCelcius;

    public double convertorFahrenheit () {

        return (temperaturaCelcius * 1.8) + 32;

    }

    public double convertorKelvin () {

        return temperaturaCelcius + 273.15;

    }

    public double menuUsuario (Scanner sc) {

        char resp;

        System.out.println("Digite um numero: ");
        this.temperaturaCelcius = sc.nextDouble();

        System.out.println("Qual temperatura deseja olhar a conversão ?");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        resp = sc.next().charAt(0);

        if (resp == '1'){

            return convertorFahrenheit();

        }else if (resp == '2'){

            return convertorKelvin();

        }
        return temperaturaCelcius;
    }
}
