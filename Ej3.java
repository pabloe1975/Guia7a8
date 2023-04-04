/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7a8;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String moneda;
        double cantidad = 0;

        System.out.println("Ingrese cant $ :");
        cantidad = leer.nextDouble();

        System.out.println("Elija moneda a cambiar");
        System.out.println("(D)olares - (Y)enes - (L)ibras ");
        moneda = leer.next();
        moneda = moneda.toUpperCase();

        convertir(cantidad, moneda);
        
        
    }
    public static void convertir(double cantidad, String moneda) {

        switch (moneda) {
            case "D":
                System.out.println("DOLARES: " + cantidad * 1.28611);
                break;
            case "Y":
                System.out.println("YENES: " + cantidad * 0.86);
                break;
            case "L":
                System.out.println("LIBRAS: " + cantidad * 129.852);
                break;
        }

    }

}
