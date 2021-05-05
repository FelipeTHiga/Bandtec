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
public class Calculadora {

    private Double resultado;

    public void somar(Double number1, Double number2) {
        resultado = number1 + number2;

        System.out.printf("\n %.2f + %.2f = %.2f",
                number1,
                number2,
                resultado);
    }

    public void subtrair(Double number1, Double number2) {
        resultado = number1 - number2;

        System.out.printf("\n %.2f - %.2f = %.2f",
                number1,
                number2,
                resultado);
    }

    public void multiplicar(Double number1, Double number2) {
        resultado = number1 * number2;

        System.out.printf("\n %.2f * %.2f = %.2f",
                number1,
                number2,
                resultado);
    }

    public void dividir(Double number1, Double number2) {
        resultado = number1 / number2;

        System.out.printf("\n %.2f / %.2f = %.2f",
                number1,
                number2,
                resultado);
    }

}
