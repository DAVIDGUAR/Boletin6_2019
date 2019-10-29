/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6_2019;

/**
 *
 * @author david
 */
public class Ventas_anuales {

    private int ventas;
   private String nombre;

    public Ventas_anuales(String nombre, int ventas) {

        this.nombre = nombre;
        this.ventas = ventas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void calculo_ventas_anuales() {
        if (ventas <= 100) {
            System.out.println("Articulo de consumo bajo");

        } else if (ventas > 100 && ventas < 500) {
            System.out.println("Articulo de consumo medio");

        } else if (ventas > 500 && ventas <= 1000) {
            System.out.println("Articulo de consumo alto");
        } else if (ventas < 1000) {
            System.out.println("Articulo de consumo de primera necesidad");

        }
        
        
        
        
        
        

    }

    @Override
    public String toString() {
        return " nombre = " + nombre + ", ventas = " + ventas  ;
    }
    
    
    
    
    

}
