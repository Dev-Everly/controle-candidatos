package controle_candidatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       imprimirSelecionados();






    }

    public static void imprimirSelecionados() {
        List<String> candidatos= new ArrayList<>(List.of(
                "Maria", "Pedro", "Sandro","Evanio", "Brandon"
        ));

       // for (int i = 0; i < candidatos.size(); i++) {
       //     System.out.println("Candidato  de nº " + (i + 1) + ": " + candidatos.get(i));
        // }

        //simplificado sem retornar indice forEach

        for( String candidato :  candidatos) {
            entrandoEmContato(candidato);
        }
    }


    public static void entrandoEmContato ( String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando =!atendeu;

            if (continuarTentando) {
                tentativas++;
            }

        } while (tentativas  < 3 & continuarTentando );

        if(atendeu ) {
            System.out.println("Conseguimos contato com " + candidato + " na tentativa: " + tentativas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " número de tentativas: " + tentativas);
        }
    }

    //metodo auxiliar
    public static boolean atender() {
        return new Random().nextInt(3) == 1;
    }


    public static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado demais candidatos");
        }
    }

}
