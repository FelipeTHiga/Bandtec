/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class ListaInteiros {

    public static void main(String[] args) {
        ArrayList<Integer> listaInteiros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        Integer inputNumero;
        Integer somaTotal = 0,
                maiorNumero = 0,
                menorNumero = 0;

        do {
            System.out.println("Insira um número: ");
            inputNumero = leitor.nextInt();

            listaInteiros.add(inputNumero);

        } while (inputNumero != 0);

        // Exibir numeros pares
        System.out.println("Números pares: ");
        for (Integer n : listaInteiros) {
            if (n % 2 == 0) {
                System.out.println(n);

            }
        }

        System.out.println("\nNúmeros ímpares:");
        for (Integer n : listaInteiros) {
            if (n % 2 != 0) {
                System.out.println(n);

            }
        }

        for (Integer n : listaInteiros) {

            if (n > maiorNumero) {
                maiorNumero = n;
            }

            if (n < menorNumero) {
                menorNumero = n;
            }
            somaTotal += n;
        }
        System.out.println("\nMaior número: " + maiorNumero
                + "\nMenor número: " + menorNumero
                + "\nSoma Total: " + somaTotal);

    }
}
