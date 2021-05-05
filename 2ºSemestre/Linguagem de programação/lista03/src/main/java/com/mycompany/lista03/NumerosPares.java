/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista03;

/**
 *
 * @author fehig
 */
public class NumerosPares {
    public static void main(String[] args) {
        Integer number=0;
        Boolean isEven;
        
        
        while(number<=40){
            isEven = number%2==0;
            
            if(isEven){
                System.out.println(number);
            }            
            number++;
        }                        
    }
   
}
