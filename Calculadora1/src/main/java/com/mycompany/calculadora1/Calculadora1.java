/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora1;


import java.util.Scanner;

/**
 *
 * @author pjdiaz
 */
public class Calculadora1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Valor 1");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese Valor 2");
        double num2 = scanner.nextDouble();
        
        scanner.close();
        
      

        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        
        int opcion = scanner.nextInt();
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = sumar(num1 , num2);
                 break;
            case 2:
                resultado = restar(num1 , num2);
                break;
            case 3:
                resultado = multiplicar(num1 ,num2);
                break;
            case 4:
                resultado = dividir(num1 , num2);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        
        System.out.println("El resultado es: " + resultado);
    
    }

    private static double sumar(double d, double num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static double restar(double d, double num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static double multiplicar(double d, double num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static double dividir(double d, double num2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 

    
