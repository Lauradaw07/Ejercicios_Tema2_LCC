package com.company;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        double base, altura;

        System.out.println("Introduce la base del rectángulo (cm)");

        Scanner sc = new Scanner(System.in);
        base = sc.nextDouble();

        System.out.println("Introduce la altura del rectángulo (cm)");

        Scanner sc2 = new Scanner(System.in);
        altura = sc2.nextDouble();

        System.out.println("El perímetro del rectángulo es: " + ((base * 2) + (altura * 2)));

        System.out.println("El área del rectángulo es: " + (base * altura));
    }
}
