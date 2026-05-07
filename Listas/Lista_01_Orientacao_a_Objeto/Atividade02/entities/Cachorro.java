package Lista_01_Orientacao_a_Objeto.Atividade02.entities;

import java.util.Scanner;

public class Cachorro {

    private String nomeCachorro;
    private String racaCachorro;
    private int idadeCachorro;


    public String estadoCachorro () {

        return "O 1 cachorro se chama " + nomeCachorro + " é da raça " + racaCachorro + " e sua idade é " + idadeCachorro + " e ele está latindo Au Au !!!";

    }

    public String estadoCachorro02 () {

        return "O 2 cachorro se chama " + nomeCachorro + " é da raça " + racaCachorro + " e sua idade é " + idadeCachorro + " e ele está latindo Au Au !!!";

    }

    public String menuDog (Scanner sc) {

        System.out.println("Qual o nome do seu 1 cachorro ?");
        this.nomeCachorro = sc.nextLine();

        System.out.println("Qual a raça do seu 1 cachorro ?");
        this.racaCachorro = sc.nextLine();

        System.out.println("Qual a idade do seu 1 cachorro ?");
        this.idadeCachorro = sc.nextInt();
        sc.nextLine();

        return estadoCachorro();

    }
    public String menuDog02 (Scanner sc) {

        System.out.println("Qual o nome do seu 2 cachorro ?");
        this.nomeCachorro = sc.nextLine();

        System.out.println("Qual a raça do seu 2 cachorro ?");
        this.racaCachorro = sc.nextLine();

        System.out.println("Qual a idade do seu 2 cachorro ?");
        this.idadeCachorro = sc.nextInt();
        sc.nextLine();

        return estadoCachorro02();

    }
}
