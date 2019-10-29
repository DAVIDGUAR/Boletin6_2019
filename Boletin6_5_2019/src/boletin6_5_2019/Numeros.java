/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Numeros {

    int numa, numb, numc;

    public Numeros() {
    }

    public void setNuma() {
        this.numa = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
    }

    public void setNumb() {
        this.numb = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
    }

    public void setNumc() {
        this.numc = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
    }

    public int calculo() {

        this.numa = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        this.numb = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        this.numc = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        
        
        if (numa > numb) {

            if (numa > numc) {

                System.out.println("El numero mas grande es: " + numa);

            }

        } else if (numc > numb) {

            if (numc > numa) {

                System.out.println("El numero mas grande es: " + numc);

            }

        } else {
            System.out.println("El numero mas grande es: " + numb);

        }

        return numa;

    }
}
