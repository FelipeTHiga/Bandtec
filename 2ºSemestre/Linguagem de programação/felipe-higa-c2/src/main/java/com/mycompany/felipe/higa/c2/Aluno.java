/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.felipe.higa.c2;

/**
 *
 * @author fehig
 */
public class Aluno {

    // Atributos
    private String ra;
    private String nome;
    private Boolean ativo;
    private Boolean inadimplente;
    private Double media;

    // Construtor
    public Aluno(String nome, String ra) {
        this.ra = ra;
        this.nome = nome;

        // Por padrão o aluno será sempre instânciado como ativo, com média 0 e pagamento em dia
        this.ativo = true;
        this.inadimplente = false;
        this.media = 0.0;
    }

    // Metodos
    public void calcularMedia(Double nota1, Double nota2) {
        media = (nota1 * 0.4) + (nota2 * 0.6);
    }

    public void calcularMedia(Double nota1, Double nota2, Double nota3) {
        media = (nota1 + nota2 + nota3) / 3;
    } // Sobrecarga
    

    @Override
    public String toString() {
 
        return "Aluno:"
                + "\nRA: " + ra
                + "\nNome " + nome
                + "\nAtivo: " + ((ativo)? "Ativo" : "Inativo")
                + "\nInadimplente: " + ((inadimplente)? "Sim" : "Não")
                + "\nMédia: " + ((media>=6)? "Aprovado" : "Reprovado")
                + "\n----------------"
                + "\nO aluno " + nome + " foi " + ((media>=6)? "Aprovado" : "Reprovado");
    }

    // Getters e Setters
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getInadimplente() {
        return inadimplente;
    }

    public void setInadimplente(Boolean inadimplente) {
        this.inadimplente = inadimplente;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

}
