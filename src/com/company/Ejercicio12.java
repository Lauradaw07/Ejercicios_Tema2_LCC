package com.company;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        double euros, pesetas;

        System.out.println("CONVERSOR EUROS-PESETAS");
        System.out.println("-------------------------");

        System.out.println("Introduce euros");
        Scanner sc = new Scanner(System.in);
        euros = sc.nextDouble();

        pesetas = euros * 166.38;
        System.out.println("El resultado es: " + pesetas);
    }
}
