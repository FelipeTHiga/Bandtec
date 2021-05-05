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
public class Termometro {

    // Valores passados em Celsius
    Double temperaturaAtual, temperaturaMax, temperaturaMin;

    public Termometro() {
    }

    public Termometro(Double inputTemperaturaMax,
            Double inputTemperaturaMin,
            Double inputTemperaturaAtual) {

        temperaturaMax = inputTemperaturaMax;
        temperaturaMin = inputTemperaturaMin;
        temperaturaAtual = inputTemperaturaAtual;

        if (temperaturaAtual > temperaturaMax) {
            temperaturaAtual = temperaturaMax;
        } else if (temperaturaAtual < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        }

        //validaTemperatura();       
    }

    public void aumentaTemperatura(Double valorAumentado) {
        temperaturaAtual += valorAumentado;

        if (temperaturaAtual > temperaturaMax) {
            temperaturaAtual = temperaturaMax;
        }

        //validaTemperatura();
    }

    public void diminuiTemperatura(Double valorDeduzido) {
        temperaturaAtual -= valorDeduzido;

        if (temperaturaAtual < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        }

        //validaTemperatura();
    }

    /*
    Pelo enunciado não tive certeza se a validação da temperatura atual com relação aos limites definidos,
    deveria ser feita nos próprios métodos, na dúvida a fiz assim, porém uma alternativa seria implementar 
    um método para validação.
        
    public void validaTemperatura() {
        if (temperaturaAtual > temperaturaMax) {
            temperaturaAtual = temperaturaMax;
        } else if (temperaturaAtual < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        }
    } */
    public void exibeFahrenheit() {
        Double temperaturaFahrenheit = (temperaturaAtual * 9 / 5) + 32;

        System.out.println("Temperatura atual em fahreinheit:" + temperaturaFahrenheit + "ºF");
    }

    public void exibeCelsius() {        
        System.out.println("Temperatura atual em Celsius:" + temperaturaAtual + "ºC");
    }

}
