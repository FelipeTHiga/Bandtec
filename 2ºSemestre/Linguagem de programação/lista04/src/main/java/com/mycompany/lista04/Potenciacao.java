/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista04;


/**
 *
 * @author fehig
 */
public class Potenciacao {
    public static void main(String[] args) {
        potencia(2,3);
        
    }
    
    public static void potencia(Integer base, Integer exponent){
        Integer result = 1;
        
        for(Integer count=0; count<exponent; count++){
            result = base* result;
            
        }
        
        System.out.printf("%d elevado a %d é igual a %d", base, exponent, result);
    
    }
    
}
