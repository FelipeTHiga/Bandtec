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
public class BolsaFilhos {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer years0To3, years4To16, years17To18, totalOfSons;
        Double benefitValue;
        
        System.out.println("Quantos filhos de 0 a 3 anos possui");
        years0To3 = scan.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos possui");
        years4To16 =  scan.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos possui");
        years17To18 = scan.nextInt();
        
        benefitValue = (years0To3*25.12)+(years4To16*15.88)+(years17To18*12.44);
        totalOfSons = years0To3+years17To18+years4To16;
        
        
        System.out.printf("Você tem um total de %d e vai receber R$%.2f de bolsa",totalOfSons,benefitValue);
        
    }
    
    
}
