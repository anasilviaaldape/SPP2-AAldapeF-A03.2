/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aaldapef.a03.pkg2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPAAldapeFA032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //Llamar teclado
        Scanner keyboard= new Scanner (System.in);
        
        System.out.println("Calculadora de hipotenusa");
        //Declaracion de variables
        double CO;
        double CA;
        double HIP;
        
        //Pedir datos
        System.out.println("Introduce longitud Cateto Opuesto");
        CO= keyboard.nextDouble();
        System.out.println("Introduce longitud Cateto Adyacente");
        CA= keyboard.nextDouble();
        
        //Calcular hipotenusa
        HIP= Math.sqrt(Math.pow(CO,2)+Math.pow(CA,2));
        
        //Mostrar hipotenusa
        System.out.println("El lado de la hipotenusa mide " + HIP);
        System.out.println("El metodo utilizado fue double, Math.sqrt y Math.pow");
        
        
        
        
        
    }
    
}
