/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author genay47u
 */
public class Exo2 {
    public static void test() {
        System.out.println("@@ Test exo2");
        StringBuilder sb = new StringBuilder();
        
        System.out.println("sb après construction : " + sb);
        sb.append("Le salaire de Dupont s'élève à ");
        System.out.println("sb après ajout : " + sb);
        
        sb = sb.append(1750.25);
        System.out.println("sb après ajout 1750.25 : " + sb);
        
        sb = sb.append(" euros");
        System.out.println("sb après ajout euros : " + sb);
        
        int idxDe = sb.indexOf("de");
        System.out.println("sb après ajout de : " + idxDe);
        
        sb = sb.insert(idxDe + 2, " Monsieur");
        System.out.println("sb après ajout de monsieur : " + sb);
        
        sb.replace(idxDe + 3, idxDe + 11, "Madame");
        System.out.println("sb après replace par madame : " + sb);
        
        StringBuilder sb2 = new StringBuilder("ABCDE");
        System.out.println("Renversement de " + sb2 + " : " + sb2.reverse());
        
    }
    
}
