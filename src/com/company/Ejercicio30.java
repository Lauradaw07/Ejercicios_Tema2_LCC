package com.company;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        System.out.println("Calcular caída libre");
        System.out.println("t = √2h/g");
        System.out.println("------------------------------------");

        float h;

        System.out.println("Introduce la altura");
        Scanner sc = new Scanner(System.in);
        h = sc.nextFloat();

        System.out.println("El objeto tarda en caer " + Math.sqrt((2 * h)/9.81));
    }
}
