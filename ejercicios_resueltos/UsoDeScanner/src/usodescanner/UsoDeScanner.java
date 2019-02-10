/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodescanner;

import java.util.Scanner;

/**
 *
 * @author claudioaltamiranda
 */
public class UsoDeScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a, b, suma;
        
        System.out.print("Ingrese el primer entero: ");
        a = sc.nextInt();
        System.out.print("Ingrese otro entero: ");
        b = sc.nextInt();
        
        suma = a + b;
        
        System.out.printf("%d + %d = %d%n", a, b, suma);
    }
    
}
