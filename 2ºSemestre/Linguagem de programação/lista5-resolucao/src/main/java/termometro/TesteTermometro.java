/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termometro;



/**
 *
 * @author fehig
 */
public class TesteTermometro {
    public static void main(String[] args) {
                        
        // Criação de um objeto da classe Termometro
        Termometro termometroTeste = new Termometro();
        
        // Atribuição de valores aos atributos termometroTeste
        termometroTeste.temperaturaAtual = 25.0;
        termometroTeste.temperaturaMax = 250.0;
        termometroTeste.temperaturaMin = -100.0;
        
        // Chamada dos métodos do objeto Termometro       
        // Temperatura inicial:
        System.out.println("----- Temperatura inicial -----");
        termometroTeste.exibeCelsius();
        termometroTeste.exibeFahrenheit();
        //Valor esperado = 25ºC / 77ºF
        
        System.out.println("\n----- Temperatura mais 25ºC -----");
        termometroTeste.aumentaTemperatura(25.0);
        termometroTeste.exibeCelsius();
        termometroTeste.exibeFahrenheit();
        //Valor esperado = 50ºC / 122ºF
        
        System.out.println("\n----- Temperatura menos 50ºC -----");
        termometroTeste.diminuiTemperatura(50.0);
        termometroTeste.exibeCelsius();
        termometroTeste.exibeFahrenheit();
        //Valor esperado = 0ºC / 32°F
        
        System.out.println("\n----- Temperatura mais 99999ºC -----");
        termometroTeste.aumentaTemperatura(99999.0);
        termometroTeste.exibeCelsius();
        termometroTeste.exibeFahrenheit();
        //Valor esperado = 250ºC / 482ºF
        
        System.out.println("\n----- Temperatura menos 999999ºC -----");
        termometroTeste.diminuiTemperatura(999999.0);
        termometroTeste.exibeCelsius();
        termometroTeste.exibeFahrenheit();
        //Valor esperado = -100ºC / -148ºF
        
        
        
        
        Termometro termometroSobrecarga = new Termometro(100.00,0.0,30.0);
        
        // Chamada dos métodos do objeto termometroSobrecarga
        System.out.println("\n\n----- Termometro 2 -----");
        
        // Temperatura inicial:
        System.out.println("----- Temperatura inicial -----");
        termometroSobrecarga.exibeCelsius();
        termometroSobrecarga.exibeFahrenheit();
        //Valor esperado = 30ºC / 86ºF
        
        System.out.println("\n----- Temperatura mais 20ºC -----");
        termometroSobrecarga.aumentaTemperatura(20.0);
        termometroSobrecarga.exibeCelsius();
        termometroSobrecarga.exibeFahrenheit();
        //Valor esperado = 50ºC / 122ºF
        
        System.out.println("\n----- Temperatura menos 50ºC -----");
        termometroSobrecarga.diminuiTemperatura(50.0);
        termometroSobrecarga.exibeCelsius();
        termometroSobrecarga.exibeFahrenheit();
        //Valor esperado = 0ºC / 32°F
        
        System.out.println("\n----- Temperatura mais 99999ºC -----");
        termometroSobrecarga.aumentaTemperatura(99999.0);
        termometroSobrecarga.exibeCelsius();
        termometroSobrecarga.exibeFahrenheit();
        //Valor esperado = 100ºC / 212ºF
        
        System.out.println("\n----- Temperatura menos 999999ºC -----");
        termometroSobrecarga.diminuiTemperatura(999999.0);
        termometroSobrecarga.exibeCelsius();
        termometroSobrecarga.exibeFahrenheit();
        //Valor esperado = -0ºC / 32ºF
                                     
    }
    
}
