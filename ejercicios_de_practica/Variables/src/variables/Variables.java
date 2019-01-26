/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author claudioaltamiranda
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;  // declaración de una variable entera
        int y;  // declaración de una variable entera
        int grande;
        
        x = 10; // asignación
        y = 3;  // asignación
        
        System.out.println(x + y);  // referenciar
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        
        grande = 2147483647;
        
        System.out.println("Variable entera grande: ");
        System.out.println(grande);
    }
    
}
