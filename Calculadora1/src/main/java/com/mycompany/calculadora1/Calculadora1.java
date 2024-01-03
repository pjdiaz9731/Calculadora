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
    }
}
//