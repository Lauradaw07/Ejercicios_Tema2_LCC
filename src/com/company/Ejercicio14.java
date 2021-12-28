package com.company;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        double precioBase, impuesto, precioTotal;

        System.out.println("Introduce el precio base");
        Scanner sc = new Scanner(System.in);
        precioBase = sc.nextDouble();

        impuesto = precioBase * 0.21;

        precioTotal = precioBase + impuesto;

        System.out.println("El precio final es: " + precioTotal);
    }
}
