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
public class Encomenda {

    private Double altura, largura, distancia, valorEncomenda, valorFrete;
    private String enderecoRemetente, enderecoDestinatario;
    private Boolean enviado;

    public Encomenda() {
        this.enviado = false;
    }

    public Encomenda(Double altura, Double largura, Double distancia, Double valorEncomenda, String enderecoRemetente, String enderecoDestinatario) {
        this.altura = altura;
        this.largura = largura;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.enviado = false;
    }

    
    
    public Boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorEncomenda() {
        return valorEncomenda;
    }

    public void setValorEncomenda(Double valorEncomenda) {
        this.valorEncomenda = valorEncomenda;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }
        
    @Override
    public String toString() {
        return "\nAltura=" + altura
                + "\nLargura=" + largura
                + "\nDistancia=" + distancia
                + "\nValorEncomenda=" + valorEncomenda
                + "\nEnderecoRemetente=" + enderecoRemetente
                + "\nEnderecoDestinatario=" + enderecoDestinatario
                + "\nEnviado=" + enviado;
    }

}
