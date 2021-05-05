/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author fehig
 */
public class ProgramaCalculo {
    public static void main(String[] args) {
        // Criação do objeto calculadora
        Calculadora calculadora = new Calculadora();
        
        System.out.println("Iniciando programa calculadora...");
        
        // Calculos utilizando metodos
        calculadora.somar(10.0, 2.0);
        calculadora.subtrair(10.0, 2.0);
        calculadora.multiplicar(10.0, 2.0);
        calculadora.dividir(10.0, 2.0);
        
    }
   
}
