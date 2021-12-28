package com.company;

import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {

        //Variables
        int numInicio, numFin;

        System.out.println("-----------------------------------------------");
        System.out.println("|    NÚMEROS DENTRO DE UN RANGO, DE 7 EN 7    |");
        System.out.println("-----------------------------------------------");

        System.out.println("Introduce el primer número del rango:");
        Scanner sc = new Scanner(System.in);
        numInicio = sc.nextInt();

        System.out.println("Introduce el segundo número del rango:");
        numFin = sc.nextInt();

        System.out.println("-----------------------------------------------");
        System.out.println("Los números enteros comprendidos en el rango son:");
        for (int i = numInicio; i < numFin; i += 7){
            System.out.println(i);
        }
    }
}
