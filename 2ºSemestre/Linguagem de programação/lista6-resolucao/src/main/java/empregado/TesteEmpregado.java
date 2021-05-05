/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empregado;

/**
 *
 * @author fehig
 */
public class TesteEmpregado {

    public static void main(String[] args) {
        // Criar objeto joao
        Empregado joao = new Empregado();
        // Atribuir valores ao objeto
        joao.nome = "João";
        joao.cargo = "Analista de Sistemas";
        joao.salario = 5400.00;

        // Testar métodos do objeto
        System.out.println("-----------");
        joao.reajustarSalario(15.0);

        joao.exibirInfo();

        // Criar objeto Bruno
        Empregado bruno = new Empregado();
        // Atribuir valores ao objeto
        System.out.println("-----------");
        bruno.nome = "Bruno";
        bruno.cargo = "Estágiario de serviços";
        bruno.salario = 1500.00;

        // Testar métodos do objeto
        bruno.reajustarSalario(10.0);

        bruno.exibirInfo();
       

    }
}
