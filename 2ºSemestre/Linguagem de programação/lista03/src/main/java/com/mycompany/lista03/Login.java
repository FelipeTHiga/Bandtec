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
public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user, password;
        Boolean loginValid;
        
       do{
           System.out.println("Usuário:");
           user = scan.next();
           
           System.out.println("Senha:");
           password = scan.next();
       
           loginValid = ("admin".equals(user)) && ("#Bandtec".equals(password));
           
           System.out.println(user+password);
           
           if(loginValid){           
               System.out.println("Login realizado com sucesso");            
           } 
           else{
               System.out.println("Login e/ou senha inválidos");
               
           }
           
       }              
       while(!loginValid);
        
        
        
    }
}
