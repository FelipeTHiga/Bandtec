/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class ProgramaEleicao {

    public static void main(String[] args) {
        // Intanciação do objeto
        UrnaEletronica urnaEletronicaTeste = new UrnaEletronica();

        // Inicio da eleição
        System.out.println("Começou a eleição!");
        
        urnaEletronicaTeste.votar("candidato1");
        urnaEletronicaTeste.votar("candidato2");
        exibirTotalDeVotos(urnaEletronicaTeste);
        
        urnaEletronicaTeste.votar("candidato2");
        urnaEletronicaTeste.votar("candidato1");
        urnaEletronicaTeste.votar("candidato1");
        
        exibirTotalDeVotos(urnaEletronicaTeste);

        //Final da eleição
        System.out.println("\nEleição encerrada!\n"
                + "-----------------------------");

        urnaEletronicaTeste.encerrarEleicao();

        exibirTotalDeVotos(urnaEletronicaTeste);
        exibirVencedor(urnaEletronicaTeste);

        urnaEletronicaTeste.votar("candidato1");

    }
      
    // Método para calcular e exibir o total de votos
    public static void exibirTotalDeVotos(UrnaEletronica urnaAnalisada) {
        Integer votosTotais, votosCandidato1, votosCandidato2;

        votosCandidato1 = urnaAnalisada.getVotosCadidato1();
        votosCandidato2 = urnaAnalisada.getVotosCadidato2();
        votosTotais = votosCandidato1 + votosCandidato2;

        System.out.println("Total de votos: " + votosTotais);
    }
    
    // Analisa e exibe o vencedor da eleição
    public static void exibirVencedor(UrnaEletronica urnaAnalisada) {
        Integer votosCandidato1, votosCandidato2;
        String vencedor = null;
        Boolean ocorreuEmpate;

        votosCandidato1 = urnaAnalisada.getVotosCadidato1();
        votosCandidato2 = urnaAnalisada.getVotosCadidato2();

        if (votosCandidato1 == votosCandidato2) {
            ocorreuEmpate = true;

        } else if (votosCandidato1 > votosCandidato2) {
            vencedor = "Candidato1";
            ocorreuEmpate = false;
        } else {
            vencedor = "Candidato2";
            ocorreuEmpate = false;
        }

        if (ocorreuEmpate) {
            System.out.println("Ocorreu um empate, será necessário um segundo turno");
        } else {
            System.out.println("Resultado: " + vencedor + " venceu");
        }
    }

}
