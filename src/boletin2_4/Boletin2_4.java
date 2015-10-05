/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         float num1, num2, suma, resta, division, multiplicacion;
        System.out.println("Introduce un numero");
        Scanner numero1 = new Scanner(System.in);
        num1 = numero1.nextFloat();
        System.out.println("Introduce otro numero");
        Scanner numero2 = new Scanner(System.in);
        num2 = numero2.nextFloat();
        suma = num1+num2;
        resta = num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;
        System.out.println("suma= "+suma);
        System.out.println("resta= "+resta);
        System.out.println("multiplicacion= "+multiplicacion);
        System.out.println("division = "+division);
    }
    
}
