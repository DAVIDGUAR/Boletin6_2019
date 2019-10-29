/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin6_3_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Numero obx1 = new Numero(Integer.parseInt(JOptionPane.showInputDialog("Introduce numero POSITIVO o NEGATIVO")));
        obx1.comprobar_numero();
        
        
        
    }
    
}
