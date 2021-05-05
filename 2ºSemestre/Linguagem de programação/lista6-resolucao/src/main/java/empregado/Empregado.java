/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author fehig
 */
public class Empregado {

    String nome, cargo;
    Double salario;

    public void reajustarSalario(Double reajuste) {
        salario *= (reajuste + 100) / 100;
    }

    public void exibirInfo() {
        System.out.printf("Nome: %s \n"
                + "Cargo: %s \n"
                + "Salário: R$%.2f \n", nome, cargo, salario);

    }
}
