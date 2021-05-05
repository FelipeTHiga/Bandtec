/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista02;

import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class MediaNotas {
    public static void main(String[] args) {
        String name;
        Double grade1, grade2, average;
        Boolean approved;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe seu nome:");
        name= scan.next();
        
        System.out.println("Informe a nota da P1:");
        grade1= scan.nextDouble();
        
        System.out.println("Informe a nota da P2:");
        grade2 = scan.nextDouble();
        
        average = (grade1*0.4)+(grade2*0.6);
        approved= average>=6;
        
        System.out.printf("Olá, %s, sua média foi de %.1f \n", name, average);
        
        
        if(approved){
            System.out.println("Você está aprovado!");
        } else{
            System.out.println("Você está reprovado.");
        }
        
        
    }
}
