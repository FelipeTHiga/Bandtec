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
public class CalculadoraCalorias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer warmUpTime, cardioTime, weightTrainingTime, totalTrainingTime,totalCalories;
        
        System.out.println("Insira os valores solicitados a seguir em minutos. \n");
        
        System.out.println("Tempo de aquecimento:");
        warmUpTime = scan.nextInt();
        
        System.out.println("Tempo praticando aeróbicos:");
        cardioTime = scan.nextInt();
        
        System.out.println("Tempo de musculação:");
        weightTrainingTime = scan.nextInt();
        
        totalTrainingTime = warmUpTime+cardioTime+weightTrainingTime;
        
        totalCalories  =  (warmUpTime*12)+(cardioTime*20)+(weightTrainingTime*25);
        
        System.out.printf("Olá, Jorge.Você fez um total de %d minutos de exercícios e perdeu %d calorias",
                totalTrainingTime
                ,totalCalories);
       
    }
}
