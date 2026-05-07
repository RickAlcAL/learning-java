package Lista_01_Orientacao_a_Objeto.Atividade01.entities;

import java.util.Random;

public class Lampada {

    public boolean ligada;

    public void metodoLigada () {
        ligada = true;
    }

    public void metodoDesligado () {
        ligada = false;
    }

    public String estadoLampada () {

        if (ligada){

            return "Lampada Ligada";

        } else {

            return "Desligada";

        }
    }
}
