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
public class Pokemon {

    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces;

    public Pokemon(String nome, String tipo, Double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        doces = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    @Override
    public String toString() {
        return String.format("---- Pokemon ----- \n"
                + "Nome: %s\n"
                + "Tipo: %s\n"
                + "Força: %.2f\n"
                + "Doces: %d\n", nome, tipo, forca, doces);
    }

}
