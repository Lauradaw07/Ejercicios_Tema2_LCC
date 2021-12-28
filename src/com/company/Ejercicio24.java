package com.company;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        System.out.println("Calcular número mayor");
        System.out.println("----------------------");

        int num, num2, numeroMayor = 0;

        System.out.println("Introduce el primer valor");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println("Introduce el segundo valor");
        num2 = sc.nextInt();

        System.out.println("----------------------");

        numeroMayor = num > num2?num:num2;

        System.out.println("El número mayor es: " + numeroMayor);
    }
}
