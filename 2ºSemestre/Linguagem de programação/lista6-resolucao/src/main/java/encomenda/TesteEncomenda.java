/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encomenda;

/**
 *   Teste de mesa:
 * altura     largura      distancia      valorEncomenda       valorFrete     ValorTotal
 *   4           4            10              R$100,00           R$4,00        R$104,00
 *   4           17           10              R$100,00           R$6,00        R$106,00
 *   13          4            10              R$100,00           R$6,00        R$106,00
 *   14          14           10              R$100,00           R$6,00        R$106,00
 *   17          4            10              R$100,00           R$8,00        R$108,00
 *   4           60           10              R$100,00           R$8,00        R$108,00
 *   4           4            60              R$100,00           R$6,00        R$106,00
 *   4           4            500             R$100,00           R$8,00        R$108,00
 *   14          17           60              R$100,00           R$8,00        R$108,00
 *   20          70           500             R$100,00           R$13,00       R$113,00
 * 
 * @author fehig
 */
public class TesteEncomenda {
    public static void main(String[] args) {
        //Instancição do objeto
        Encomenda encomendaTeste = new Encomenda();
        
        
        encomendaTeste.altura = 4.00;
        encomendaTeste.largura = 4.00;
        encomendaTeste.distancia = 60.00;
        encomendaTeste.valorEncomenda = 100.00;
        encomendaTeste.enderecoRemetente = "R.Haddock Lobo, 131";
        encomendaTeste.enderecoDestinatario = "Av. Larajeira, 390";

        encomendaTeste.emitirEtiqueta();
        
    }       
}
