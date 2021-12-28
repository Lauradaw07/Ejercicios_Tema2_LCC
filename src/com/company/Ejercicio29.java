package com.company;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {

        System.out.println("Resolver ecuación de primer grado");
        System.out.println("ax + b = 0");
        System.out.println("------------------------------------");

        double a, b, x;

        System.out.println("Introduce el valor de a");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();

        System.out.println("Introduce el valor de b");
        b = sc.nextDouble();

        x = -b/a;

        System.out.println("El valor de x es: " + x);
    }
}
