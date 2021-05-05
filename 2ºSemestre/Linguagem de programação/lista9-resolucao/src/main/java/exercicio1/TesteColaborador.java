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
public class TesteColaborador {
    public static void main(String[] args) {
        // Criação dos obejtos
        Colaborador colaboradorLinx = new Colaborador();
        
        Colaborador colaboradorSafra = new Colaborador("Jose","Programador Junior", 3500.00);
        
        RecursosHumanos rh = new RecursosHumanos();
        
        // Atribuição de valores para os atributos
        colaboradorLinx.setNome("João");
        colaboradorLinx.setCargo("Estagiario");
        colaboradorLinx.setSalario(1700.00); 
        
        //Exibição das informações iniciais
        System.out.println(colaboradorLinx);
        System.out.println(colaboradorSafra);
        
        //Promoção de colaborador com salário maior
        rh.promoveColaborador(colaboradorLinx, "Programador Junior", 3000.00);
        
        //Promoção de colaborador com salário menor
        rh.promoveColaborador(colaboradorSafra, "Programador Pleno", 2000.00);
        
        //Reajuste de salário de colaborador
        rh.reajustarSalario(colaboradorSafra, 2700.00);
        
        //Exibição das informações após operações      
        System.out.println(colaboradorLinx);
        System.out.println(colaboradorSafra);
        
        System.out.println(rh);
        
    }
}
