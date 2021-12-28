package com.company;

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {

        //Variables
        int x;
        int y;

        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************************************");
        System.out.println("*          NÚMERO ELEVADO A OTRO NÚMERO (x^y)           *");
        System.out.println("*********************************************************");
        System.out.println("Introduce el valor de x:");
        x = sc.nextInt();
        System.out.println("Introduce el valor de y:");
        y = sc.nextInt();

        System.out.println("*********************************************************");
        System.out.println("El resultado de " + x + "^" + y + " = " + Math.pow(x, y));


    }
}
