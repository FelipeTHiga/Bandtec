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
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer number, product, factor;

        System.out.println("---- Tabuada ----");
        System.out.println("Digite um número:");
        number = scan.nextInt();

        for ( Integer k = 0; k<=10 ; k++ ){
        factor = k;
        product = factor*number;

        System.out.printf("%d x %d = %d\n", factor, number, product);
       
        }
    }   
}
