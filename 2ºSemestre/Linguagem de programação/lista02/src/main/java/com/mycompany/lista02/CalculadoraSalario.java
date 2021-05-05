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
public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double salary, taxPercent, taxTotal;
        
        System.out.println("Informe seu sálario:");
        salary = scan.nextDouble();
        System.out.println("Informe a porcentagem de imposto:");
        taxPercent = scan.nextDouble();
        
        taxTotal = salary-(salary*taxPercent/100);
        
        System.out.printf("Se o salário for de R$%.2f e o imposto for de %.1f%%, o salário liquído será R$%.2f",
               salary,
               taxPercent,
               taxTotal);
        
    }
}
