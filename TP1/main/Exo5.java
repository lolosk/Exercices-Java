/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.HashMap;

/**
 *
 * @author genay47u
 */
public class Exo5 {
    public static void test() {
        System.out.println("@@ Test Exo5");
        
        HashMap<Integer,String> hm = new HashMap<>();
        
        hm.put(1, "Lundi");
        hm.put(2, "Mardi");
        hm.put(4, "Jeudi");
        hm.put(6, "Samedi");
        hm.put(7, "Repos");
        hm.put(5, "Vendredi");
        
        System.out.println("HashMap initial : " + hm);
        
        if (hm.containsKey(4)) {
            System.out.println("HashMap initial : " + hm.get(4));
        }
        
        hm.put(3, "Mercredi");
        
        System.out.println("HashMap avec Mercredi : " + hm);
        
        System.out.println("Taille HashMap : " + hm.size());
        
        hm.put(7, "Dimanche");
        
        hm.remove(2);
        System.out.println("HashMap sans clé 2 : " + hm);
        
        
    }
    
}
