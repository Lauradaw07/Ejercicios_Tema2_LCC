package com.company;

import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {

        //Variables
        int num, cuadrado, cubo;

        System.out.println("------------------------------------");
        System.out.println("|    CUADRADO Y CUBO DE 5 NÚMEROS   |");
        System.out.println("------------------------------------");
        System.out.println("Introduce un número:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println("\n" + "------------------------------------------");
        System.out.println("| Número" + "\s" + "\s" + "\s" + "\s" + "\s" + "Cuadrado" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "Cubo         |");
        System.out.println("-------------------------------------------");

        for (int i = num + 1; i < num + 6; i++){
            System.out.println(" " + i + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + + i + "^2 = " + Math.pow(i,2) + "\s" + "\s" + "\s" + "\s" + "\s" + i + "^3 = " + Math.pow(i,3));
        }


    }
}