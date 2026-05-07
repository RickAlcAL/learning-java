package Lista_01_Orientacao_a_Objeto.Atividade09.applications;

import Lista_01_Orientacao_a_Objeto.Atividade09.entities.Agenda;
import Lista_01_Orientacao_a_Objeto.Atividade09.entities.Contato;

import java.util.Scanner;

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        Agenda agendaUsuario = new Agenda();
        Contato contatoUsuario = new Contato();

        System.out.println(agendaUsuario.menuContato(sc));

    }
}
