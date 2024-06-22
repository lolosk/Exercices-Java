/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author genay47u
 */
public class Exo4 {
    public static void test() {
        List<Integer> list1 = new ArrayList<>();
        list1.addLast(4);
        list1.addLast(7);
        list1.addLast(3);
        
        System.out.println("List1 : " + list1);
        
        int[] tab = {1,6,9,3,5};
        List<Integer> list2 = new ArrayList<>();
        
        for (int x:tab) {
            list2.addLast(x);
        }
        
        System.out.println("List2 : " + list2);
        
        list1.addAll(list2);
        System.out.println("Liste1 + List2" + list1);
        
        System.out.println("List1 a l index 5 : " + list1.get(5));
        
        if (list1.contains(3)){
            System.out.println("Première occurence de 3 : " + list1.indexOf(3));
        }
        
        list1.remove(1);
        System.out.println("Liste 1 sans le deuxième élément : " + list1);
        
        System.out.println("Taille de List 1 : " + list1.size());
    }
    
}
