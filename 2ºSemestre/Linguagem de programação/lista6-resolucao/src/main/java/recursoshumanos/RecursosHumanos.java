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
public class RecursosHumanos {

    Integer totalPromovidos = 0, 
            totalReajustes = 0;

    public void reajustarSalario(Colaborador beneficiado, Double reajuste) {
        beneficiado.salario = reajuste;
        totalReajustes++;
    }

    public void promoveColaborador(Colaborador beneficiado, String novoCargo, Double novoSalario) {

        if (beneficiado.salario > novoSalario) {
            System.out.println("-------------\n"
                    + "Operação inválida");
        } else {
            beneficiado.salario = novoSalario;
            beneficiado.cargo = novoCargo;
            totalPromovidos++;
        }
    }
    
    
}
