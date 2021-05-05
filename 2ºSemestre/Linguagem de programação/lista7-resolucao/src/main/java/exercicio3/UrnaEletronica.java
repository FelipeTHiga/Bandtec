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
public class UrnaEletronica {

    // Definição dos atributos
    private Integer votosCandidato1 = 0, 
                    votosCandidato2 = 0;
    
    private Boolean eleicaoEncerrada = false;

    
    // Metodos
    public Integer getVotosCadidato1() {
        return votosCandidato1;
    }

    public Integer getVotosCadidato2() {
        return votosCandidato2;
    }
    
    public Boolean getEleicaoEncerrada(){
        return eleicaoEncerrada;
    }
    
    public void votar(String candidato) {
        if (!eleicaoEncerrada) {
            switch (candidato) {
                case "candidato1":
                    votosCandidato1++;
                    System.out.printf("Candidato1 recebeu 1 voto, totalizando: %d \n", votosCandidato1);
                    
                    break;

                case "candidato2":
                    votosCandidato2++;
                    System.out.printf("Candidato2 recebeu 1 voto, totalizando: %d \n", votosCandidato2);
                    break;
                                   
                default:
                    System.out.println("Erro: Candidato inválido");
                    break;                    
            }
        }
        
        else{
            System.out.println("Eleição encerrada, você não pode mais votar");
        }        
    }

    public void encerrarEleicao(){
        eleicaoEncerrada = true;
    }
}
