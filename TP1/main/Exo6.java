/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.time.LocalDateTime;

/**
 *
 * @author genay47u
 */
public class Exo6 {
    public static void test() {
        System.out.println("@@ Test exo6");
        
        LocalDateTime maintenant = LocalDateTime.now();
        System.out.println("Date de maintenant, bros : " + maintenant);
        
        DateTimeFormater dtf = DateTimeFormater.ofPatern("EEE dd MMMM y HH:mm");
        System.out.println("Maintenant en mieux présenté : " + dtf);
        
        
    }
    
}
