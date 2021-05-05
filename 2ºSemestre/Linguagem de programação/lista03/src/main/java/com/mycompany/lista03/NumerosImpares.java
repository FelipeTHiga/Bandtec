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
public class NumerosImpares {
    public static void main(String[] args) {
        Integer number;
        Boolean isOdd;
        
        for (Integer k = 0; k<=90; k++){
            number = k;
            isOdd = number%2!=0;
            
            if(isOdd){
                System.out.println(number);                
            }        
        }                
    }
}
