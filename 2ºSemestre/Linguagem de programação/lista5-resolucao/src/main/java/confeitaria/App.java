/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria;

/**
 *
 * @author fehig
 */
public class App {
    public static void main(String[] args) {
        
        // Bolo bolo = new Bolo(sabor,valor,quantidadeVendida);
        
        // Criação do objeto boloChocolate 
        System.out.println("----- Bolo de chocolate -----\n");
        Bolo boloChocolate = new Bolo("chocolate",30.0,0);
        
        // Teste dos métodos do objeto boloChocolate
        boloChocolate.comprarBolo(10);
        boloChocolate.exibirRelatorio();
        
        // Criação do objeto boloMorango
        System.out.println("\n----- Bolo de morango -----\n");
        Bolo boloMorango = new Bolo("morango",60.0,20);
        boloMorango.comprarBolo(20);
        boloMorango.exibirRelatorio();
        //O valor do bolo inserido ultrapassa o valor máximo que uma unidade de bolo pode ser vendida
        //que é R$50. Portanto o valor sido bolo é modificado para R$50
        
        // Criação do objeto boloAbacaxi
        System.out.println("\n----- Bolo de abacaxi -----\n");
        Bolo boloAbacaxi = new Bolo("abacaxi",40.0,80);
        
        // Teste dos métodos do objeto boloAbacaxi
        boloAbacaxi.comprarBolo(40);
        boloAbacaxi.exibirRelatorio();
        
         
        // Criação do objeto boloUva
        System.out.println("\n----- Bolo de uva -----\n");
        Bolo boloUva = new Bolo("uva",40.0,90);
        
        // Teste dos métodos do objeto boloUva
        boloUva.comprarBolo(20);
        boloUva.exibirRelatorio();
        
        
    }
}
