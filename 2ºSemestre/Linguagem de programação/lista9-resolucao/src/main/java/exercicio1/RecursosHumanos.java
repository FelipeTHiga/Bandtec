/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author fehig
 */
public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalReajustes;

    public RecursosHumanos() {
        totalPromovidos = 0;
        totalReajustes = 0;
    }

    public void reajustarSalario(Colaborador beneficiado, Double reajuste) {
        beneficiado.setSalario(reajuste);
        totalReajustes++;
    }

    public void promoveColaborador(Colaborador beneficiado, String novoCargo, Double novoSalario) {

        if (beneficiado.getSalario() > novoSalario) {
            System.out.println("-------------\n"
                    + "Operação inválida");
        } else {
            beneficiado.setSalario(novoSalario);
            beneficiado.setCargo(novoCargo);
            totalPromovidos++;
        }
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getTotalReajustes() {
        return totalReajustes;
    }

    public void setTotalReajustes(Integer totalReajustes) {
        this.totalReajustes = totalReajustes;
    }
        
    @Override
    public String toString() {
        return  "TotalPromovidos=" + totalPromovidos + 
                "\nTotalReajustes=" + totalReajustes;
    }
    
    
}
