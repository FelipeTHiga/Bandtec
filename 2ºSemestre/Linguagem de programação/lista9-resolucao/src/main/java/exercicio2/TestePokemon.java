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
public class TestePokemon {
    public static void main(String[] args) {
        // Instanciação dos objetos
        Pokemon pokemonTeste = new Pokemon("Pikachu", "Eletrico", 50.00);         
        Pokemon pokemonTeste2 = new Pokemon("Eevee", "Normal", 25.00);
        TreinadorPokemon treinadorPokemon = new TreinadorPokemon("Satoshi", 10);

        
      
        // Print informações iniciais
        System.out.println(pokemonTeste);
        System.out.println(pokemonTeste2);
        System.out.println(treinadorPokemon);
        
        // Treinar pokemonTeste
        treinadorPokemon.treinarPokemons(pokemonTeste);
        treinadorPokemon.treinarPokemons(pokemonTeste);
        treinadorPokemon.treinarPokemons(pokemonTeste);
        treinadorPokemon.treinarPokemons(pokemonTeste);
        treinadorPokemon.treinarPokemons(pokemonTeste);
        
        treinadorPokemon.evoluirPokemon(pokemonTeste, "Raichu");
        
        System.out.println(pokemonTeste);
        
        // Treinar pokemonTeste2
        treinadorPokemon.treinarPokemons(pokemonTeste2);
        treinadorPokemon.treinarPokemons(pokemonTeste2);
        
        treinadorPokemon.evoluirPokemon(pokemonTeste2, "Vaporeon");
        
        System.out.println(pokemonTeste2);
        
        // Info do treinador
        System.out.println(treinadorPokemon);
        
    }        
}
