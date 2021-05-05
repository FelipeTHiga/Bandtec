/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author fehig
 */
public class Dadinho {
   // Atributo
    private Integer numeroSorteado;
    
    public Integer sortearNumero(){
        numeroSorteado = ThreadLocalRandom.current().nextInt(1,6);
        return numeroSorteado;
    }    
    
}
