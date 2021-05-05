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
public class App {
    public static void main(String[] args) {
        // Instanciação dos objetos 
        Aluno alunoJoao = new Aluno("João","01202060");
        Aluno alunoMaria= new Aluno("Maria","01202068");
        Aluno alunoBruno = new Aluno("Bruno","01202049");
        Secretaria secretaria = new Secretaria();
        
        // Calculando médias
        alunoJoao.calcularMedia(10.00, 9.5);
        alunoMaria.calcularMedia(6.0, 6.0, 6.0);
        alunoBruno.calcularMedia(5.0, 6.0);
        
        // Registrando pagamento para o primeiro aluno
        secretaria.registraPagamento(alunoJoao);
        
        // Registrar atraso no pagamento do segundo aluno
        secretaria.registraAtrasoPagamento(alunoMaria);
        
        // Registrar cancelamento do terceiro aluno
        secretaria.registraCancelamento(alunoBruno);
        
        // Verificando aprovação dos três alunos
        System.out.println("\n---- Aluno 1 ----");
        secretaria.verificaAprovacaoAluno(alunoJoao);
        
        System.out.println("\n---- Aluno 2 ----");
        secretaria.verificaAprovacaoAluno(alunoMaria);
        
        System.out.println("\n---- Aluno 3 ----");
        secretaria.verificaAprovacaoAluno(alunoBruno);
        
        // Exibindo informações da secretária
        System.out.println("\n---- Secretaria ----");
        System.out.println(secretaria);
        
    }
}
