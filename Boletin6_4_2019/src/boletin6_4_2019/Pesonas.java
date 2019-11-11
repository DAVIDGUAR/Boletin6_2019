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

    private int peso,pesoa,pesob;
    private String nombre,nombrea,nombreb;
  

    public Pesonas( String nombre,int peso) {
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
    
  /*  public void calculo(){
        this.nombrea = JOptionPane.showInputDialog("Introduce nombre");
        this.pesoa = Integer.parseInt(JOptionPane.showInputDialog("Introduce  peso"));
       this.nombreb = JOptionPane.showInputDialog("Introduce nombre"); 
        this.pesob = Integer.parseInt(JOptionPane.showInputDialog("Introduce  peso"));
        
        
        if (pesoa< pesob) {

            System.out.println("La persona que pesa mas es: " + nombreb + " com un peso de: "+ pesob + " y la diferencia de pesos es: " + (pesob - pesoa)+ "kg");
           
        }
        else if (pesoa > pesob) {

            System.out.println("La persona que pesa mas es: " + nombrea +" com un peso de: " + pesoa + " y la diferencia de pesos es: " + (pesoa - pesob)+" kg");

        } else {

            System.out.println("Tienen el mismo peso " + nombrea + " y " + nombreb + " com un peso de:" + pesoa +" kg" );

    }
    
    }*/
    
    
    public void comparar(Pesonas dato1, Pesonas dato2){
        
        if (dato1.peso>dato2.peso){
            
            System.out.println(dato1.getNombre()+" e o mais pesado " + dato1.getPeso());
        }else{
            
            System.out.println(dato2.getNombre()+" e o mais pesado " + dato2.getPeso());
            
        }
        
        
    }
    

    @Override
    public String toString() {
        return " nombre= " + nombre + " y peso= " + peso;
    }

}
