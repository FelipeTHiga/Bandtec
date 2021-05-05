/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursoshumanos;

/**
 *
 * @author fehig
 */
public class Colaborador {

    String nome, cargo;
    Double salario;

    public void exibeInfo() {
        System.out.printf("-------------\n"
                + "Nome: %s\n"
                + "Cargo: %s\n"
                + "Salario: %.2f\n", nome, cargo, salario);
    }

}
