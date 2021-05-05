/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista04;

import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class Divisao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer inputNumber;
        Boolean invalidInput;
        

        do {
            System.out.println("Digite um número inteiro e positivo");
            
            inputNumber = scan.nextInt();
            
            invalidInput = inputNumber<0;
            
            if(invalidInput){
                System.out.println("Número digitado inválido \n");            
            }
            
        } while (invalidInput);

        exibeDivisores(inputNumber);

    }

    public static void exibeDivisores(Integer number) {

        if (number != 0) {
            System.out.print("São divisores de " + number + ": 1");

            for (Integer count = 2; count < number; count++) {
                if (number % count == 0) {
                    System.out.printf(", %d", count);
                }
            }

            if (number != 1) {
                System.out.print(" e " + number);
            }

        } else {
            System.out.println("Todos os números são divisores de zero, exceto o próprio zero");
        }

    }

}
