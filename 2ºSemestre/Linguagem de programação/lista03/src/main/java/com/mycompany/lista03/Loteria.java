/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author fehig
 */
public class Loteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer inputNumber, drawNumber, attempts;
        Boolean veryLucky, lucky;
              
        attempts = 0;                
        
        do {
            attempts++;
           
            System.out.printf("---- %d° Tentativa ---- \n",attempts);
            
            System.out.println("Digite um número entre 0 e 10:");
            inputNumber = scan.nextInt();
                    
            while(inputNumber<0 || inputNumber>10) {
                System.out.println("!! Número informado fora do intervalo solicitado !!");
                System.out.println("Digite um número entre 0 e 10:");
                inputNumber = scan.nextInt();
            }                                    
            
            drawNumber = ThreadLocalRandom.current().nextInt(0,11);
            
            System.out.printf("Número sorteado: %d \n ", drawNumber);
            
            System.out.println("-------------------- \n");
            
            
        } while(drawNumber != inputNumber);    
        
        veryLucky = attempts<=3;
        
        lucky = attempts<=10;
        
        if(veryLucky){
            System.out.println("Você é MUITO sortudo");        
        }
        else if (lucky){
            System.out.println("Você é sortudo");
        }
        else{
            System.out.println("É melhor você parar de apostar e ir trabalhar!");
        }
        
    }
}
