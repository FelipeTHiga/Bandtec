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
public class ProgramaCampeonato {

    
    public static void main(String[] args) {
   // Instanciação dos objetos
    Clube paysandu = new Clube();
    Clube portuguesa = new Clube();     
        
    // Definição do atributo nome dos times
        paysandu.setNome("Paysandu");
        portuguesa.setNome("Portuguesa");
        
        // Inicio do campeonato
        System.out.println("Começa a temporada!");
        
        // Rodada 1
        System.out.println("\nPaysandu ganhou nessa rodada\n"
                + "Portuguesa ganhou nessa rodada");
        
        paysandu.registrarVitoria();
        portuguesa.registrarVitoria();
        
        exibirPontos(paysandu);
        exibirPontos(portuguesa);
        
        System.out.println("\n-----------------------------");
         // Rodada 2
        System.out.println("Paysandu perdeu nessa rodada\n"
                + "Portuguesa empatou nessa rodada");
        
        paysandu.registrarDerrota();
        portuguesa.registrarEmpate();
        
        exibirPontos(paysandu);
        exibirPontos(portuguesa);
        
        System.out.println("\n-----------------------------");
        
         // Rodada 3
        System.out.println("Paysandu ganhou nessa rodada\n"
                + "Portuguesa perdeu nessa rodada");
        
        paysandu.registrarVitoria();
        portuguesa.registrarDerrota();
        
        exibirPontos(paysandu);
        exibirPontos(portuguesa);
        
        System.out.println("\n-----------------------------");
        //Final da temporada
        System.out.println("Final da temporada");
        
        exibirCampanha(paysandu);
        exibirCampanha(portuguesa);
        
    }
    
    public static void exibirPontos(Clube clube){        
        System.out.printf("\n%s pontos: %d", 
                    clube.getNome(),
                    clube.getPontos());
                     
    }
    
    public static void exibirCampanha(Clube clube){
            System.out.printf("\n%s: %d vitórias "
                + "\t %d derrotas "
                + "\t %d empates "
                + "\t %d pontos",
                clube.getNome(),
                clube.getVitorias(),
                clube.getDerrotas(),
                clube.getEmpates(),
                clube.getPontos());            
    }
    
        
}
