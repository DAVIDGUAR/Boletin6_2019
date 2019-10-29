/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1_2019;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin6_1_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner num1 = new Scanner(System.in);
        Numero Obx1 = new Numero();
        
        System.out.println("Introduce numero");
        int a =num1.nextInt();
        Obx1.setNumero(a);
        
        Obx1.validar_numero();
        
        
        
        
        
        
        
        
    }
    
}
