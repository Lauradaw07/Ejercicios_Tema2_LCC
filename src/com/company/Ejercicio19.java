package com.company;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        System.out.println("C1x + C2 = 0");
        System.out.println("--------------");

        double C1;

        System.out.println("Escribe el número del primer coeficiente");
        Scanner sc = new Scanner(System.in);
        C1 = sc.nextDouble();

        double C2;


        System.out.println("Escribe el número del segundo coeficiente");
        Scanner sc2 = new Scanner(System.in);
        C2 = sc2.nextDouble();

        System.out.println("x = " + ((-C1)/C2));
    }
}
