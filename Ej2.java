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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String salir;
        do {
            IngresoPersona();
            System.out.println("¿Desea continuar? Si/No");
            salir = leer.nextLine();
            
        } while (salir.equalsIgnoreCase("si"));
        
        
        
        
    }
    public static void IngresoPersona(){
        Scanner leer = new Scanner(System.in);
        String ingreso="si";
                
        //do {
          System.out.println("Ingrese el nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println(nombre+ " tiene "+edad+" años");
        if (edad<18) {
            System.out.println(nombre+" es menor de edad");
            
        }else{
            System.out.println(nombre+" es mayor de edad");
              System.out.println("Desea ingresar otra persona? Si/No");
        ingreso = leer.next();
        } while (ingreso.equalsIgnoreCase("si"));
                
        }  
    }
