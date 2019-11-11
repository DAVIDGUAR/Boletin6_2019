/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_4_2019;

/**
 *
 * @author david
 */
public class Boletin6_4_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       // Pesonas calculo1 = new Pesonas();
       Pesonas per1 = new Pesonas();
 Pesonas per2 = new Pesonas();
        per1.setNombre();
        per1.setPeso();
        per2.setNombre();
        per2.setPeso();
        Pesonas per3 = new Pesonas("david",80);
        Pesonas per4 = new Pesonas("Maria",50);
        Pesonas obx1 = new Pesonas();
        obx1.comparar(per4, per3);
        obx1.comparar(per1, per2);
        
        //calculo1.calculo();
        
       /* System.out.println(per1.getNombre());

      if (per1.getPeso() < per2.getPeso()) {

            System.out.println("La persona que pesa mas es: " + per2.toString() + " y la diferencia de pesos es: " + (per2.getPeso() - per1.getPeso()));

        }
        if (per1.getPeso() > per2.getPeso()) {

            System.out.println("La persona que pesa mas es: " + per1.toString() + " y la diferencia de pesos es: " + (per1.getPeso() - per2.getPeso()));

        } else {

            System.out.println("Tienen el mismo peso tanto " + per1.toString() + " como " + per2.toString());

        }*/
    }

}
