/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**

 * @author fehig
 */
public class TesteEncomenda {
    public static void main(String[] args) {
        //Instancição do objeto
        Encomenda encomendaTeste = new Encomenda( );
        Encomenda encomendaTeste2 = new Encomenda(5.0,6.0,70.0,200.00,"R. James, 123","R. Kin,123");
        
        Transportadora transp = new Transportadora("Fedex");
        
        encomendaTeste.setAltura(4.00);
        encomendaTeste.setLargura(4.00);
        encomendaTeste.setDistancia( 60.00);
        encomendaTeste.setValorEncomenda(100.00);
        encomendaTeste.setEnderecoRemetente("R.Haddock Lobo, 131");
        encomendaTeste.setEnderecoDestinatario("Av. Larajeira, 390");
        encomendaTeste.setEnviado(false);
        
        
        
        
        
        System.out.println(encomendaTeste2+"\n");
        System.out.println(encomendaTeste + "\n\n");        
        System.out.println(transp);
        
        transp.enviar(encomendaTeste);
        transp.enviar(encomendaTeste);
        System.out.println(transp);
               
        transp.enviar(encomendaTeste2);
        System.out.println(transp);
        
    }       
}
