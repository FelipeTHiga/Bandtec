/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;
import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class Calculadora {
    public static void main(String[] args) {               
        Integer input_number01,input_number02, sum, subtraction, multiplication;        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro");
        input_number01 = input.nextInt();
        
        System.out.println("Insira outro número inteiro");
        input_number02 = input.nextInt();
        
        sum = input_number01+input_number02;
        subtraction = input_number01-input_number02;
        multiplication = input_number01*input_number02;
        
        System.out.println("A soma dos números é:"+sum);
        System.out.println("A subtração dos números é:"+subtraction);
        System.out.println("A multiplicação dos números é:"+multiplication);        
    }
}
