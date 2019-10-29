/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_1_2019;

/**
 *
 * @author drodriguezguardiola
 */
public class Numero {
    
    int numero;

    public Numero(int numero) {
        
        this.numero = numero;
        
        
    }

    public Numero() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
     

 public int validar_numero(){
     
     if(numero>0)
         
         System.out.println("El numero es  positivo "+numero);
     
     return numero;
 }
    
    
    
    
    
}
