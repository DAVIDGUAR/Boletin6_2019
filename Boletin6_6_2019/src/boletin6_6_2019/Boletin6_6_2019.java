/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Boletin6_6_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ventas_anuales articulo1 = new Ventas_anuales(JOptionPane.showInputDialog("introduce nombre del articulo"),(Integer.parseInt(JOptionPane.showInputDialog("Intruduce cantidad de unidades vendidas"))));
       // Ventas_anuales articulo2 = new Ventas_anuales(JOptionPane.showInputDialog("introduce nombre del articulo"),(Integer.parseInt(JOptionPane.showInputDialog("Intruduce cantidad de unidades vendidas"))));
      //  Ventas_anuales articulo3 = new Ventas_anuales(JOptionPane.showInputDialog("introduce nombre del articulo"),(Integer.parseInt(JOptionPane.showInputDialog("Intruduce cantidad de unidades vendidas"))));
      //  Ventas_anuales articulo4 = new Ventas_anuales(JOptionPane.showInputDialog("introduce nombre del articulo"),(Integer.parseInt(JOptionPane.showInputDialog("Intruduce cantidad de unidades vendidas"))));
    
        System.out.print("Producto: " + articulo1.toString()+ " "); 
        articulo1.calculo_ventas_anuales();
    
    
    
    
    
    }
    
}
