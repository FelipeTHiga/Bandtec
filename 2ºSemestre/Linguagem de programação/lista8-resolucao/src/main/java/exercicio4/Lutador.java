/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author fehig
 */
public class Lutador {

    // Atributos
    private Integer vida;
    private Boolean lutadorVivo;

    // Get
    public Integer getVida() {
        return vida;
    }

    public Boolean getLutadorVivo() {
        return lutadorVivo;
    }

    // Construtor vazio    
    public Lutador() {
        vida = 100;
        lutadorVivo = vida > 0;
    }

    // Métodos da classe
    public void apanhar() {
        if (lutadorVivo) {
            vida -= 10;
        }       
    }

    public void concentrarForca() {
        if (lutadorVivo) {
            vida += 2;
        }

    }

}
