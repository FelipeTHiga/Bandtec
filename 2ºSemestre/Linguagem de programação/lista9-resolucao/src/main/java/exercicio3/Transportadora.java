/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author fehig
 */
public class Transportadora {
    private String nome;
    private Integer envios;
    private Double faturamento;

    public Transportadora(String nome) {
        this.nome = nome;
        envios= 0;
        faturamento = 0.0;
    }
    
    
    
     public void calcularFrete(Encomenda encomenda) {

        Double  taxaEncomenda,
                taxaDistancia,
                totalFrete;
                       
        taxaEncomenda = classificarEncomenda(encomenda.getAltura(), encomenda.getLargura());
        taxaDistancia = classificarDistancia(encomenda.getDistancia());
        totalFrete = (encomenda.getValorEncomenda() * taxaEncomenda) + taxaDistancia;        
        encomenda.setValorFrete(totalFrete);
    }
    
    
    public Double classificarEncomenda(Double altura, Double largura) {
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

    public Double classificarDistancia(Double distancia) {
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



    public void emitirEtiqueta(Encomenda encomenda) {        
        calcularFrete(encomenda);
        double valorTotal = encomenda.getValorFrete() + encomenda.getValorEncomenda();

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
                encomenda.getValorEncomenda(),
                encomenda.getEnderecoDestinatario(),
                encomenda.getAltura(),
                encomenda.getLargura(),
                encomenda.getValorEncomenda(),
                encomenda.getValorFrete(),
                valorTotal);
    }
    
    public void enviar(Encomenda encomenda){
        if(encomenda.getEnviado()){
            System.out.println("Encomenda já enviada");        
        }
        else{
            calcularFrete(encomenda);
            encomenda.setEnviado(true);
            envios++;
            faturamento+=encomenda.getValorFrete();
        }
    }

    @Override
    public String toString() {
        return "Transportadora{" + "nome=" + nome + ", envios=" + envios + ", faturamento=" + faturamento + '}';
    }
    
}
