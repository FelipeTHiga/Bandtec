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
public class Secretaria {

    // Atributos
    private Integer totalInadimplentes;
    private Integer totalCancelamentos;
    private Integer totalPagamentos;

    // Construtor
    public Secretaria() {
        totalInadimplentes = 0;
        totalCancelamentos = 0;
        totalPagamentos = 0;
    }

    // Métodos
    public void registraPagamento(Aluno aluno) {
        String nome = aluno.getNome();
        String ra = aluno.getRa();

        // Se o pagamento é feito por um aluno inadimplente, a contagem de inadimplentes totais diminui
        if (aluno.getInadimplente()) {
            totalInadimplentes--;
        }

        aluno.setInadimplente(false);

        System.out.printf("O aluno %s de RA %s esta em dia com o pagamento\n", nome, ra);

        totalPagamentos++;
    }

    public void registraAtrasoPagamento(Aluno aluno) {
        String nome = aluno.getNome();
        String ra = aluno.getRa();

        if (aluno.getInadimplente()) {
            System.out.printf("O aluno %s de RA %s já está inadimplente\n", nome, ra);
        } else {
            aluno.setInadimplente(true);
            System.out.printf("O aluno %s de RA %s está inadimplente\n", nome, ra);
            totalInadimplentes++; // O total do inadimplentes só aumenta quando um aluno que não era
                                  // inadimplente passa a ser um.
        }

    }

    public void registraCancelamento(Aluno aluno) {
        String nome = aluno.getNome();
        String ra = aluno.getRa();

        aluno.setAtivo(false);

        System.out.printf("O aluno %s de RA %s cancelou a matrícula\n", nome, ra);
        totalCancelamentos++;
    }

    public void verificaAprovacaoAluno(Aluno aluno) {
        System.out.println(aluno);
    }

    @Override
    public String toString() {
        return "Relatório"
                + "\nPagamentos realizados: " + totalPagamentos
                + "\nInadimplentes: " + totalInadimplentes
                + "\nEvasões: " + totalCancelamentos;
    }

    // Getters e Setters
    public Integer getTotalInadimplentes() {
        return totalInadimplentes;
    }

    public void setTotalInadimplentes(Integer totalInadimplentes) {
        this.totalInadimplentes = totalInadimplentes;
    }

    public Integer getTotalCancelamentos() {
        return totalCancelamentos;
    }

    public void setTotalCancelamentos(Integer totalCancelamentos) {
        this.totalCancelamentos = totalCancelamentos;
    }

    public Integer getTotalPagamentos() {
        return totalPagamentos;
    }

    public void setTotalPagamentos(Integer totalPagamentos) {
        this.totalPagamentos = totalPagamentos;
    }

}
