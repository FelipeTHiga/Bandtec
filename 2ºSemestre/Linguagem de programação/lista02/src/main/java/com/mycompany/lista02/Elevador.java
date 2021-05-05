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
public class Elevador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer peopleLimit;
        Double weightLimit, weight1, weight2, weight3;

        System.out.println("Qual o limite de peso do elevador?");
        weightLimit = scan.nextDouble();

        System.out.println("Qual o limite de pessoas do elevador?");
        peopleLimit = scan.nextInt();

        System.out.println("Qual o peso da 1º pessoa que entrou no elevador?");
        weight1 = scan.nextDouble();

        System.out.println("Qual o peso da 2º pessoa que entrou no elevador?");
        weight2 = scan.nextDouble();

        System.out.println("Qual o peso da 3º pessoa que entrou no elevador?");
        weight3 = scan.nextDouble();
        
        //printf() equivale a um print() com String.format() dentro.
        System.out.printf("Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n"
                + "O peso total no elevador é %.2fKG, sendo que ele suporta %.2fKG \n",
                peopleLimit,
                weight1 + weight2 + weight3,
                weightLimit);

        
    }
}
