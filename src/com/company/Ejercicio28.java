package com.company;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        int horas;

        System.out.println("Calcular salario semanal en función de horas:");
        System.out.println("-----------------------------------------------");

        System.out.println("Introduce el número de horas");
        Scanner sc = new Scanner(System.in);
        horas = sc.nextInt();

        if (horas <= 40) {
            System.out.println("El salario es " + (horas * 12) + " € a la semana");
        } else {
            System.out.println("El salario es " + (horas * 16) + " € a la semana");
        }
    }
}
