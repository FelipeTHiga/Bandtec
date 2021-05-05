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
public class Sorteio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer inputNumber, oddCount, evenCount, drawPosition ,randomNumber;
        Boolean isEven;
       
        evenCount = 0;
        oddCount = 0;
        
        // Caso o número não seja sorteado, ele retornará a posição -1
        drawPosition = -1;
        
        do{
            
            System.out.println("Digite um número entre 0 e 100");
            inputNumber = scan.nextInt();     
            
        }while( inputNumber>100 || inputNumber<0 );
        
        for(Integer count = 1; count<=200; count++){
            
            randomNumber = ThreadLocalRandom.current().nextInt(0,100);
            
            isEven = randomNumber%2==0;
            
            if (inputNumber == randomNumber && drawPosition== -1){
                drawPosition = count;
            }
            
            if(isEven){
                evenCount++;                        
            }
            else {
                oddCount++;
            }            
        }
        
        System.out.println("------ Sorteio ------");
        
        
        //Se o número não for sorteado, drawPosition armazena um valor negativo.
        if(drawPosition<0){
            System.out.println("Seu número não foi sorteado.");
        }
        
        else{
            System.out.printf("O número %d foi sorteado na posição:%d \n", 
                        inputNumber, 
                        drawPosition);
        }
        
        System.out.printf("%d Números impares sorteados \n"
                    + "%d Números pares sorteados",
                    oddCount,
                    evenCount);
        
    }
}
