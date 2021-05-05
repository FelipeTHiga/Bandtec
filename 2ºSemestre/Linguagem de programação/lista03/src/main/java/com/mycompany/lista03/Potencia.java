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
public class Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer base, exponent, result;
        Boolean invalidInput;
        
        System.out.println("Insira apenas valores inteiros e positivos.");
        
        do{
            System.out.println("Informe a base:");
            base = scan.nextInt();

            invalidInput = base<0;
        
            if(invalidInput){
                System.out.println("Informe um valor inteiro e positivo");
            }
            
        } while (invalidInput);
        
        
        System.out.println("----------");
        
        
        do{
            System.out.println("Informe o expoente:");
            exponent = scan.nextInt();

            invalidInput = exponent<0;
            
            if(invalidInput){
                System.out.println("Informe um valor inteiro e positivo");
            }

        } while(invalidInput);
        
        result = 1;
        for(Integer k =0; k<exponent; k++){
            result = result*base;
        }
        System.out.println("Resultado:"+result);
        
    }
}
