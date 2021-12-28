package com.company;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {

        double x, y;

        //Declaración de x e y

        System.out.println("Introduce el valor de x");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();

        System.out.println("Introduce el valor de y");
        Scanner sc2 = new Scanner(System.in);
        y = sc2.nextDouble();

        //Cuentas

        System.out.println("x = " + x + " y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x/y = " + (x/y));
        System.out.println("x^2 = " + (Math.pow(x,2)));
        System.out.println("y^2 = " + (Math.pow(y,2)));
        System.out.println("√x = " + (Math.sqrt(x)));
        System.out.println("√y = " + (Math.sqrt(y)));
    }
}
