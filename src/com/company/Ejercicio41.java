package com.company;

import java.util.Scanner;
//TODO ARREGLAR
public class Ejercicio41 {
    public static void main(String[] args) {
        //Variables
        int num;

        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int ultimoNumero = num % 10;

        System.out.println("El último número es: " + ultimoNumero);
    }
}
