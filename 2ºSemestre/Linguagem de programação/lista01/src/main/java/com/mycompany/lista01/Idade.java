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
public class Idade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String name = input.nextLine();
        
        System.out.println("Olá,"+name+"! Qual o ano do seu nascimento?");
        Integer birthYear = input.nextInt();
        
        System.out.println("Em 2030 você terá "+(2030-birthYear)+" anos");
        
    }
}
