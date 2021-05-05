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
public class Clube {
    // Atributos da classe
    private Integer vitorias = 0, 
                    derrotas = 0, 
                    empates = 0,
                    pontos = 0;
    
    private String nome;
    
    // Metodos Get & Set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }    
    
    public Integer getVitorias(){
        return vitorias;
    }
    
    public Integer getDerrotas(){
        return derrotas;
    }
    
    public Integer getEmpates(){
        return empates;
    }
    
    public Integer getPontos(){
        return pontos;
    }
    
    // Metodos para configurar vitorias, derrotas e empates
    public void registrarVitoria(){
        vitorias++;
        pontos+=3;
    }
    
    public void registrarDerrota(){
        derrotas++;
    }
    
    public void registrarEmpate(){
        empates++;
        pontos++;
    }
    
}
