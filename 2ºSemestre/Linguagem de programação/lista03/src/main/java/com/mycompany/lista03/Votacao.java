/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class Votacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer votesMuzzarella, votesPepperoni, VotesFourCheeses, inputNumber, mostVotes;
        Boolean invalidVote;
        String winner = null;
                       
        //Zerar votos no início de cada votação
        votesMuzzarella = 0;
        votesPepperoni = 0;
        VotesFourCheeses =0;        
        
        for (Integer count = 0; count<10; count++){
            System.out.println("----- Votação ----- \n"
                + "Para votar digite o código de sua pizza favorita e pressione ENTER \n");
        
        
        
            System.out.println("----- Códigos ----- \n"
                + "Mussarela: 5 \n"
                + "Calabresa: 25 \n"
                + "Quatro queijos: 50 \n ");
        
      
            
            do{
            System.out.println("Insira seu voto:");
            inputNumber = scan.nextInt();
          
            
            // Validação do voto
            invalidVote = inputNumber!=5 && 
                          inputNumber!=25 && 
                          inputNumber!=50;
                                    
            if(invalidVote){
                System.out.println("Código inserido inválido \n");
            }
            
            else{
                System.out.println("Voto computado \n");            
            }
            
            
            }while(invalidVote);
          
            //Contagem dos votos
            switch(inputNumber){
                case 5:
                    votesMuzzarella++;
                    break;
                
                case 25:
                    votesPepperoni++;
                    break;
                
                case 50:
                    VotesFourCheeses++;
                    break;
                
                default:          
                    System.out.println("Voto inválido");
                    break;                    
            }                                                         
        }                
        
        // Verificar vencedor
        mostVotes = 0;
        
          if(votesPepperoni>mostVotes){
              winner = "Calabresa";
              mostVotes= votesPepperoni;
          }
          
          if(votesMuzzarella>mostVotes){
              winner = "Mussarela";
              mostVotes= votesMuzzarella;
          }
          
          if(VotesFourCheeses>mostVotes){
              winner = "Quatro queijos";
              mostVotes= VotesFourCheeses;
          }
          
        
        System.out.printf("----- Resultado ----- \n"
                + "Votos para Mussarela: %d \n"
                + "Votos para Calabresa: %d \n"
                + "Votos para Quatro queijos: %d \n"
                + "Vencedor: %s",votesMuzzarella ,votesPepperoni, VotesFourCheeses, winner);
        
        
        
    }
}
