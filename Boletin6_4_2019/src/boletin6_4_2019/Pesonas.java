/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Pesonas {
    
    private int peso;
    private String nombre;

    public Pesonas(int peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }

    public Pesonas() {
    }
    
    
    
    

    public int getPeso() {
        return peso;
    }

    public void setPeso() {
        this.peso = Integer.parseInt(JOptionPane.showInputDialog("Introduce  peso"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = JOptionPane.showInputDialog("Introduce nombre");
    }

    @Override
    public String toString() {
        return  " nombre= " + nombre +" y peso= " + peso ;
    }
    

    
}
    
    
    
    
    
    
    
    

