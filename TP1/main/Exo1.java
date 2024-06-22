/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author genay47u
 */
public class Exo1 {
    
    public static void test() {
    String s; //déclaration
        s = "Before you start coding, it’s a good idea to sit down and think about your problem";
        int longueur = s.length();
        System.out.println(s);
        System.out.println("Longueur: " + longueur);
        char cl = s.charAt(0);
        System.out.println("Premier caractère : " + cl);
        char cn = s.charAt(longueur-1);
        System.out.println("Dernier caractère: " + cn);
        String sEnMaj = s.toUpperCase();
        System.out.println("En Majuscules : " + sEnMaj);
        
        int idr = s.indexOf("r");
        System.out.println("Indice du premier r : " + idr);
        
        int nbA = 0;
        for (int i = 0; i < s.length() ; i++){
            if (s.charAt(i) == 'a'){
                nbA++;
            } else{
                //rien
            }
                
        }
        System.out.println("Nbre de a :" + nbA);
}
    
}
