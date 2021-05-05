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
public class Acumulador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer total, inputNumber;

        total = 0;
        
        System.out.println("----- Acumulador ----- \n"
                + "\n- Informe um número para somá-lo ao total \n"
                + "- Informe '0' para exibir total.");
        
        do{
            
            inputNumber = scan.nextInt();
            total = total +inputNumber;
        
        }while(inputNumber != 0);
        
        System.out.println("----- Resultado -----");
        System.out.println("Total da soma:"+total);
        
    }
}
