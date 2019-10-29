/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3_2019;

/**
 *
 * @author drodriguezguardiola
 */
public class Numero {
    
    int a,dato;
    

    public Numero(int a) {
        this.a = a;
    }
    
    public void comprobar_numero(){
        
        if (a>0){
            
            dato=1;
            
        }
       else if (a<0){
            dato=2;
            
        }
       else {
            dato=3;
            
            
        }
        
        
        switch(dato){
            
            case 1:
                
                System.out.println("EL numero es positivo '+' ");
                
                break;
                
            case 2:
                
                System.out.println("El numero es negativo '-' ");
                
                 break;
                 
            case 3:
                
                System.out.println("El numero es neutro '0' ");
            
             break;
             
        }
        
        
        
    }
    
 
    
}
