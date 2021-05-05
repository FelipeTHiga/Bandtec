/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria2;

/**
 *
 * @author fehig
 */
public class App {

    public static void main(String[] args) {

        // Bolo bolo = new Bolo(sabor,valor,quantidadeVendida);
        // Criação do objeto boloChocolate 
        System.out.println("----- Bolo de chocolate -----\n");
        Bolo boloChocolate = new Bolo();
        boloChocolate.sabor = "chocolate";
        boloChocolate.quantidadeVendida = 0;
        boloChocolate.valor = 30.0;

        // Teste dos métodos do objeto boloChocolate
        boloChocolate.comprarBolo(5);
        boloChocolate.comprarBolo(10);
        boloChocolate.comprarBolo(15);
        boloChocolate.comprarBolo(20);
        boloChocolate.comprarBolo(25);
        boloChocolate.exibirRelatorio();

        // Criação do objeto boloMorango
        System.out.println("\n----- Bolo de morango -----\n");
        Bolo boloMorango = new Bolo();
        boloMorango.sabor = "morango";
        boloMorango.quantidadeVendida = 20;
        boloMorango.valor = 60.0;

        //Teste dos métodos do ObjetoboloMorango
        boloMorango.comprarBolo(20);
        boloMorango.exibirRelatorio();
        //O valor do bolo inserido ultrapassa o valor máximo que uma unidade de bolo pode ser vendida
        //que é R$50. Portanto o valor do bolo é modificado para R$50

        // Criação do objeto boloAbacaxi
        System.out.println("\n----- Bolo de acabaxi -----\n");
        Bolo boloAbacaxi = new Bolo();
        boloAbacaxi.sabor = "abacaxi";
        boloAbacaxi.quantidadeVendida = 90;
        boloAbacaxi.valor = 40.0;

        // Teste dos métodos do objeto boloAbacaxi
        boloAbacaxi.comprarBolo(20);
        boloAbacaxi.exibirRelatorio();

        // Criação do objeto boloUva
        System.out.println("\n----- Bolo de creme -----\n");
        Bolo boloCreme = new Bolo();
        boloCreme.sabor = "uva";
        boloCreme.quantidadeVendida = 50;
        boloCreme.valor = 40.0;

        // Teste dos métodos do objeto boloCreme
        boloCreme.comprarBolo(20);
        boloCreme.exibirRelatorio();

    }
}
