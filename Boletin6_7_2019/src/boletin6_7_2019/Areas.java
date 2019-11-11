/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Areas {

    private double base, altura, radio;

    private int dato1;

    boolean a = true;

    public Areas() {
    }

    public void calculo_areas() {

        while (a == true) {

            this.dato1 = Integer.parseInt(JOptionPane.showInputDialog("Calcular area de :\n 1. Cuadrado. \n 2. Rectangulo. \n 3. Triangulo.\n 4. Circulo. \n selecione un numero del (1-4)"));

            switch (dato1) {

                case 1:

                    base = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor LADO"));

                    System.out.println("El area es: " + base * base);

                    System.out.println("El area es: " + Math.pow(base, 2));

                    a = false;

                    break;

                case 2:

                    base = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor BASE"));

                    altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor ALTURA"));

                    System.out.println("El area es: " + base * altura);
                    a = false;
                    break;

                case 3:

                    base = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor BASE"));

                    altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor ALTURA"));

                    System.out.println("El area es: " + base * altura / 2);
                    a = false;
                    break;

                case 4:

                    radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor RADIO"));

                    System.out.println("El area es: " + Math.PI * (Math.pow(radio, 2)));

                    System.out.printf("Redondeo = " + "%1.4f", Math.PI * (radio * radio));
                    a = false;
                    break;

            }

        }

          
    }

}
