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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc, result;
        String resp;
        boolean band = false;
        
        System.out.println("Introduzca dos números para las operaciones");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            System.out.println("  ** MENÚ **  ");
            System.out.println(" 1. SUMAR");
            System.out.println(" 2. RESTAR");
            System.out.println(" 3. MULTIPLICAR");
            System.out.println(" 4. DIVIDIR");
            System.out.println(" 5. SALIR");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("SUMA");
                    result = num1+num2;
                    System.out.println("El resultado es " + result);
                break;
                    
                case 2:
                    System.out.println("RESTA");
                    result = num1-num2;
                    System.out.println("El resultado es " + result);
             break;
                    
                case 3:
                    System.out.println("MULTIPLCACIÓN");
                    result = num1*num2;
                    System.out.println("El resultado es" + result);
                break;
                
                case 4:
                    System.out.println("DIVISIÓN");
                    result = num1/num2;
                    System.out.println("El resultado es " + result );
                    
                break;    
                            
                case 5:
                    System.out.println("SALIR");
                    System.out.println("Está seguro que desea salir  S / N ?");
                    resp = leer.next();
                    if (resp.equalsIgnoreCase("S")) {
                        System.out.println("Adios");
                    } else {
                        opc = 1 ;
                    } 
            }  
        } while (opc!=5) ;
       }
}
