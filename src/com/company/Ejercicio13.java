package com.company;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        double pesetas, euros;

        System.out.println("CONVERSOR PESETAS-EUROS");
        System.out.println("-------------------------");

        System.out.println("Introduce las pesetas");
        Scanner sc = new Scanner(System.in);
        pesetas = sc.nextFloat();

        euros = pesetas/166.38;

        System.out.println("El resultado es " + euros);
    }
}
