/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.ArrayList;


/**
 *
 * @author fehig
 */
public class ListaDeFrutas {

    private ArrayList<String> listaDeFrutas;

    public ListaDeFrutas() {
        listaDeFrutas = new ArrayList<String>();
                                
    }

    public ArrayList<String> getListaDeFrutas() {
        return listaDeFrutas;
    }        
    
    public Boolean retornaFruta(String frutaPesquisada){
        if(listaDeFrutas.contains(frutaPesquisada)){
            return true;        
        }
        return false;
    }
    
    
}
