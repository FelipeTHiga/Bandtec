/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confeitaria2;

/**
 *
 * @author fehig
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;

    public void validarBolo() {
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
        validarBolo();

        if (sabor == null) {
            System.out.println("ERRO: Não se pode comprar um bolo com sabor inválido");
        } else {

            if (quantidadeDesejada + quantidadeVendida > 100) {
                System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
            } else {
                quantidadeVendida += quantidadeDesejada;
                System.out.printf("%d Bolos comprados com sucesso.\n", quantidadeDesejada);
            }
        }
    }

    public void exibirRelatorio() {
        validarBolo();
        
        if (sabor == null) {
            System.out.println("ERRO: Não pode ser exibido o relatório de um bolo com sabor inválido");
        } else {
            System.out.printf("O bolo sabor %s foi comprado %d vezes hoje, "
                    + "totalizando RS%.2f\n", sabor, quantidadeVendida, (valor * quantidadeVendida));
        }
    }
}
