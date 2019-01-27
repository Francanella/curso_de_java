/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author claudioaltamiranda
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Esta es una cadena";
        String s2 = "";
        String s3 = "A";
        String s4 = s1 + " " + "otra cadena";
        String s5 = s1.toUpperCase();
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.charAt(5));
        System.out.println(s1.length());
        System.out.println("Claudio".length());
        System.out.println(s5);
        System.out.println(s1);
        System.out.println(s1.replace('a', 'x'));
        System.out.println(s1);
        System.out.println("Mi nombre \\ es \"Claudio\"");
    }
    
}
