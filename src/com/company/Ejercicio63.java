package com.company;

import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {

        //Variables
        int base;
        int exponente;

        System.out.println("-------------------------------------------");
        System.out.println("|            CALCULAR POTENCIA            |");
        System.out.println("-------------------------------------------");
        do {
            System.out.println("Introduce la base:");
            Scanner sc = new Scanner(System.in);
            base = sc.nextInt();
            System.out.println("Introduce el exponente:");
            exponente = sc.nextInt();
        }while (base < 0);

        System.out.println("El resultado de la potencia " + base + "^" + exponente + " es: " + Math.pow(base,exponente));
    }
}
