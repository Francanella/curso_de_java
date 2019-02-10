/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import java.lang.Math;

/**
 *
 * @author claudioaltamiranda
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado un monto, calcular cuantos billetes de 1, 5 y 10 
        son necesarios.
        
        Ej.:
        48 pesos:
            4 billetes de 10
            1 billete de 5
            3 billetes de 1
        */
        int pesos = 127;
        
        System.out.println("Pesos originales: " + pesos);
        int billetes10 = pesos / 10;
        System.out.println("Billetes de 10: " + billetes10);
        pesos = pesos - billetes10 * 10;
        int billetes5 = pesos / 5;
        System.out.println("Billetes de 5: " + billetes5);
        pesos = pesos - billetes5 * 5;
        System.out.println("Billetes de 1: " + pesos);
        
        double dNumero = 10.5f;
        // float fNumero = 10.5;
        
        double potencia = Math.pow(2, 10);
        System.out.println(potencia);
        
    }
    
}
