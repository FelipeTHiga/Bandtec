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
public class TreinadorPokemon {

    // Atributos
    private String nome;
    private Integer nivel;

    // Construtor
    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    // Métodos
    public void treinarPokemons(Pokemon pokemon) {
        Double forcaDoPokemon = pokemon.getForca();
        Integer docesDoPokemon = pokemon.getDoces();
        
        System.out.println("Treinando" + pokemon.getNome() + "...");
        
        // Aumentar status do pokémon
        pokemon.setDoces(docesDoPokemon+10);
        pokemon.setForca(forcaDoPokemon*1.1);
        
        // Aumentar nível do treinador
        nivel +=2;        
    }
    
    public void evoluirPokemon(Pokemon pokemon, String evolucao){
        
        if(pokemon.getDoces()<50){
            System.out.println("Não foi possível realizar operação");
        }                    
        else{
            // Evoluir pokémon e resetar doces
            System.out.println("Pokémon "+pokemon.getNome() + " esta evoluindo para -> " + evolucao + '!');
            
            pokemon.setNome(evolucao);
            pokemon.setDoces(0);
            
            
            
            // Aumentar nível do treinador
            nivel +=10;
        }
        
    }            
    
    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return String.format("---- Treinador ----\n"
                + "Nome: %s\n"
                + "Nivel: %d", nome, nivel);
    }

    
    
}
