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
public class Elevador {

    // Atributos
    private Integer totalPassageiros;
    private Double pesoTotal;

    // Getters and Setters
    public Integer getTotalPassageiros() {
        return totalPassageiros;
    }

    public void setTotalPassageiros(Integer totalPassageiros) {
        this.totalPassageiros = totalPassageiros;
    }

    public Double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(Double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    // Construtor vazio  
    public Elevador() {
        totalPassageiros = 0;
        pesoTotal = 0.0;
    }

    // Métodos da classe
    public void entrarPessoa(String pessoa) {
        switch (pessoa.toLowerCase()) {
            case "homem":
                this.pesoTotal += 90;
                totalPassageiros++;
                break;

            case "mulher":
                this.pesoTotal += 65;
                totalPassageiros++;
                break;

            case "criança":
                this.pesoTotal += 40;
                totalPassageiros++;
                break; 
        }

    }

}
