/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista04;

import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class Classificacao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer inputAge;

        System.out.println("Insira uma idade");
        inputAge = scan.nextInt();

        classificaIdade(inputAge);

    }

    public static void classificaIdade(Integer age) {
        boolean baby = age <= 2,
                kid = age >= 3 && age <= 11,
                teenager = age >= 12 && age <= 19,
                young = age >= 20 && age <= 30,
                adult = age >= 31 && age <= 60;

        if (baby) {
            System.out.println("Bebê");
        } else if (kid) {
            System.out.println("Criança");
        } else if (teenager) {
            System.out.println("Adolescente");
        } else if (young) {
            System.out.println("Jovem");
        } else if (adult) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

    }
}
