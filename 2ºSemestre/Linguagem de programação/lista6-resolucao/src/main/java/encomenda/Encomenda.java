/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encomenda;

/**
 *
 * @author fehig
 */
public class Encomenda {
   
    Double altura, largura, distancia, valorEncomenda;
    String enderecoRemetente, enderecoDestinatario;
     
    
    public Double calcularFrete() {

        Double  taxaEncomenda,
                taxaDistancia,
                totalFrete;

        
        taxaEncomenda = classificarEncomenda();
        taxaDistancia = classificarDistancia();
        totalFrete = (valorEncomenda * taxaEncomenda) + taxaDistancia;

        return totalFrete;
    }
    
    
    public Double classificarEncomenda() {
        Double taxaProduto;
        Boolean tamanhoPequeno = ((altura <= 6) && (largura <= 16)),
                tamanhoMedio = ((altura <= 15) && (largura <= 50));

        if (tamanhoPequeno) {
            taxaProduto = 0.01;
        } else if (tamanhoMedio) {
            taxaProduto = 0.03;
        } else {
            taxaProduto = 0.05;
        }

        return taxaProduto;
    }

    public Double classificarDistancia() {
        Double taxaDistancia;

        if (distancia <= 50) {
            taxaDistancia = 3.00;

        } else if (distancia <= 200) {
            taxaDistancia = 5.00;
        } else {
            taxaDistancia = 7.00;
        }

        return taxaDistancia;
    }



    public void emitirEtiqueta() {
        Double valorFrete = calcularFrete(),
                valorTotal = valorFrete + valorEncomenda;

        System.out.printf(
                "****** ETIQUETA PARA ENVIO ******\n"
                + "Endenreço do remetente: %s\n"
                + "Endereço do destinatário: %s\n"
                + "Altura da encomenda: %.2f\n"
                + "Largura da encomenda: %.2f\n"
                + "---------------------------------\n"
                + "Valor da encomenda: R$ %.2f\n"
                + "Valor do frete: R$%.2f\n"
                + "---------------------------------\n"
                + "Valor total: %.2f",
                enderecoRemetente,
                enderecoDestinatario,
                altura,
                largura,
                valorEncomenda,
                valorFrete,
                valorTotal);
    }
}
