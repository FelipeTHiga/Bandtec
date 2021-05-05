/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author fehig
 */
public class Cachorro {

    // Atributos
    private String apelido, porte;
    private Double peso;
    private Boolean estaObeso;

    // Construtores 
    public Cachorro() {
        estaObeso = false;
    }

    public Cachorro(String apelido, String porte, Double peso) {
        this.apelido = apelido;
        this.peso = peso;
        this.porte = porte;
        this.estaObeso = false;
    }

    // Getters & Setters
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getEstaObeso() {
        return estaObeso;
    }

    public void setEstaObeso(Boolean estaObeso) {
        this.estaObeso = estaObeso;
    }

    // Métodos    
    public void comer(String comida, Double quantidade) {

        if (quantidade > 0) {
            verificaPeso();
            if (estaObeso) {
                System.out.println("Cão obeso demais, não vai aceitar mais comida   ");
            } else {
                peso += 0.3 * quantidade;

                System.out.printf("Cão comeu %.2fKg de %s\n", quantidade, comida);
            }
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public void verificaPeso() {
        switch (porte.toLowerCase()) {

            case "pequeno":
                estaObeso = peso > 15;
                break;

            case "medio":
                estaObeso = peso > 30;
                break;

            case "grande":
                estaObeso = peso > 45;
                break;
        }
    }
    
    public void exibirInfo(){
        System.out.printf("Apelido: %s\n"
                + "Porte: %s\n"
                + "Peso: %.2f\n", apelido, porte, peso);
    
    }

}
