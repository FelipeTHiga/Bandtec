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
public class AppCachorro {

    public static void main(String[] args) {
        // Instanciação dos objetos
        Cachorro cachorroPequeno = new Cachorro();
        Cachorro cachorroMedio = new Cachorro("Bób", "Medio", 25.00);
        Cachorro cachorroGrande = new Cachorro("Bóbão", "Grande", 39.00);

        // Atribuição de valores aos atributos de cachorroPequeno
        cachorroPequeno.setApelido("Bóbinho");
        cachorroPequeno.setPorte("Pequeno");
        cachorroPequeno.setPeso(8.00);

        // Simulação de alimentação
        System.out.println("----- Cachorro Pequeno  -----");
        System.out.println("Peso do cachorro antes de comer:" + cachorroPequeno.getPeso() + "Kg");
        cachorroPequeno.comer("Ração", 10.00);
        System.out.println("Peso do cachorro após comer:" + cachorroPequeno.getPeso() + "Kg");
        cachorroPequeno.exibirInfo();

        System.out.println("\n----- Cachorro Médio  -----");
        System.out.println("Peso do cachorro antes de comer:" + cachorroMedio.getPeso() + "Kg");
        cachorroMedio.comer("Carne", 35.00);
        System.out.println("Peso do cachorro após comer:" + cachorroMedio.getPeso() + "Kg");
        cachorroMedio.comer("Carne", 35.00);
        cachorroMedio.exibirInfo();

        System.out.println("\n----- Cachorro Grande  -----");
        System.out.println("Peso do cachorro antes de comer:" + cachorroGrande.getPeso() + "Kg");
        cachorroGrande.comer("Ração", 50.00);
        System.out.println("Peso do cachorro após comer:" + cachorroGrande.getPeso() + "Kg");
        cachorroMedio.comer("Ração", 35.00);
        cachorroGrande.exibirInfo();
        
        


    }

}
