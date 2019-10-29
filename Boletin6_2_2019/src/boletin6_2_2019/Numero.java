/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2_2019;

/**
 *
 * @author drodriguezguardiola
 */
public class Numero {
    
    short a,b;

    public Numero(short a, short b) {
        
        this.a = a;
        this.b = b;
    }
    
    
    public  void comprobar_numeros(){
        
        if(a>=b){
           short resta =(short) (a-b);
           
           
            System.out.println("El resultado de a-b = "+ resta);
       
       
       
        }
            short suma=(short) (a+b);
            System.out.println("El resultado de a+b = "+suma);
            
            
            
       
        
        
    
    }  
    
    
}
