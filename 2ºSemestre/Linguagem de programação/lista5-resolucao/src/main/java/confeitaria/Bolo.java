/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria;

import java.util.Scanner;

/**
 *
 * @author fehig
 */
public class Bolo {

    protected String sabor;
    protected Double valor;
    protected Integer quantidadeVendida;

    public Bolo(String inputSabor, Double inputValor, Integer inputQuantidadeVendida) {

        sabor = inputSabor;
        valor = inputValor;
        quantidadeVendida = inputQuantidadeVendida;

        //Caso o sabor do bolo inserido não esteja dentro do escopo definido,
        //o sabor do bolo passa a ser null e o console retorna erro.
        if (!"chocolate".equals(sabor)
                && !"morango".equals(sabor)
                && !"abacaxi".equals(sabor)) {

            System.out.println("ERRO: Bolo com sabor inválido");
            sabor = null;
        }

        //Caso os parâmetros inseridos ultrapassem os valores limites estipulados,
        //eles são reajustados para o máximo ou mínimo possível.
        if (valor < 30.0) {
            valor = 30.0;
        } else if (valor > 50.0) {
            valor = 50.0;
        }

        if (quantidadeVendida > 100) {
            quantidadeVendida = 100;
        }

    }

    public void comprarBolo(Integer quantidadeDesejada) {
        Scanner leitor = new Scanner(System.in);
        String inputResposta;
        Boolean respostaValida = false;

        if (sabor == null) {
            System.out.println("ERRO: Não se pode comprar um bolo com sabor inválido");
        } else {

            if (quantidadeDesejada + quantidadeVendida > 100) {
                System.out.println("Seu pedido ultrapassa nosso limite diário para esse bolo."
                        + "\nDeseja comprar a quantidade máxima disponível? (sim/nao)");

               do {
                    inputResposta = leitor.nextLine();
                    
                    switch (inputResposta) {
                        case "sim":
                            quantidadeDesejada = 100-quantidadeVendida;            
                            respostaValida =true;
                            comprarBolo(quantidadeDesejada);
                            break;
                        
                        case "nao":
                            respostaValida =true;
                            break;
                        
                        default:
                            System.out.println("Resposta inválida.");
                            break;
                    }                    
                } while(!respostaValida);
                
                
            
            } else {
                quantidadeVendida += quantidadeDesejada;
                System.out.printf("%d Bolos comprados com sucesso.\n", quantidadeDesejada);
            }
        }
    }

    public void exibirRelatorio() {
        if (sabor == null) {
            System.out.println("ERRO: Não pode ser exibido o relatório de um bolo com sabor inválido");
        } else {
            System.out.printf("O bolo sabor %s foi comprado %d vezes hoje, "
                    + "totalizando RS%.2f\n", sabor, quantidadeVendida, (valor * quantidadeVendida));
        }
    }
}
