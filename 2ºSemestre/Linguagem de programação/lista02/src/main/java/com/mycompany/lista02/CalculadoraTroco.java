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
public class CalculadoraTroco {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double unitCost, paidValue, total;
        Integer qtdSold;

        System.out.println("Informe o valor unitário do produto:");
        unitCost = scan.nextDouble();

        System.out.println("Informe a quantidade vendida:");
        qtdSold = scan.nextInt();

        System.out.println("Informe o valor pago:");
        paidValue = scan.nextDouble();

        total = qtdSold * unitCost;
        
        if (paidValue < total) {
            System.out.println("Valor insuficiente para pagar a compra.");
            
        } else {

            System.out.println("Seu troco será de R$" + (paidValue - total)+'.');
        }
    }

}
