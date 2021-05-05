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
public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double grossSalary,netSalary,VT,INSS,IR, totalDeduction;
        
        System.out.println("Informe o salário bruto:");
        grossSalary = scan.nextDouble();
        INSS = grossSalary*0.1;
        IR = grossSalary*0.2;
        
        System.out.println("Informe o valor da condução (apenas ida):");
        VT = scan.nextDouble()*2*22;
        
        totalDeduction = INSS + IR + VT;
        
        netSalary = grossSalary - totalDeduction;
        
        System.out.printf("Seu bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um total de R$%.2f líquido,",
                grossSalary,totalDeduction,netSalary);
        
        
    }
}
