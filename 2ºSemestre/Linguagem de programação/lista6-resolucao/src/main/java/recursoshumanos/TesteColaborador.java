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
public class TesteColaborador {
    public static void main(String[] args) {
        // Criação dos obejtos
        Colaborador colaboradorLinx = new Colaborador();
        
        Colaborador colaboradorSafra = new Colaborador();
        
        RecursosHumanos rh = new RecursosHumanos();
        
        // Atribuição de valores para os atributos
        colaboradorLinx.nome = "João";
        colaboradorLinx.cargo = "Estagiario";
        colaboradorLinx.salario = 1700.00;
        
        colaboradorSafra.nome = "José";
        colaboradorSafra.cargo = "Progamador Junior";
        colaboradorSafra.salario = 3500.00;
        
        //Exibição das informações iniciais
        colaboradorLinx.exibeInfo();
        colaboradorSafra.exibeInfo();
        
        //Promoção de colaborador com salário maior
        rh.promoveColaborador(colaboradorLinx, "Programador Junior", 3000.00);
        
        //Promoção de colaborador com salário menor
        rh.promoveColaborador(colaboradorSafra, "Programador Pleno", 2000.00);
        
        //Reajuste de salário de colaborador
        rh.reajustarSalario(colaboradorSafra, 2700.00);
        
        //Exibição das informações após operações
        colaboradorLinx.exibeInfo();
        colaboradorSafra.exibeInfo();
        
        System.out.printf("----- Operações -----\n"
                + "Total de promovidos: %d\n"
                + "Total de reajustes: %d\n", rh.totalPromovidos,rh.totalReajustes);
        
    }
}
