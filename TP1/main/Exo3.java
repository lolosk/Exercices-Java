/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author genay47u
 */
public class Exo3 {
    public static void test() {
        System.out.println("@@ Test Exo3");
        
        int unEntier;
        Integer unEntierEnveloppe;
        
        unEntier = Integer.parseInt("1500");
        unEntierEnveloppe = Integer.valueOf(unEntier);
        
        System.out.println("unEntier : " + unEntier);
        System.out.println("unEntierEnveloppe : " + unEntierEnveloppe);
        
        String uneChaine;
        uneChaine = String.valueOf("12.254");
        System.out.println("uneChaine : " + uneChaine);
        
        System.out.println("1526 en binaire : " + Integer.toBinaryString(1526));
        System.out.println("1526 en hexa : " + Integer.toHexString(1526));
    }
    
}
