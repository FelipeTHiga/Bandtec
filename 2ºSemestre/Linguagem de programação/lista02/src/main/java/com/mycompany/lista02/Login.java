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
public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  
        String name,password;
        Integer failedAmount;
        
        System.out.println("Insira o login:");
        name = scan.nextLine();
        
        System.out.println("Insira a senha:");
        password = scan.next(); 
        
        System.out.println("Insira a quantidade de tentativas permitidas:");
        failedAmount= scan.nextInt();
        
        System.out.printf("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado",
                    name,
                    password,
                    failedAmount);        
    }
}
