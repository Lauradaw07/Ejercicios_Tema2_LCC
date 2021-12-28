package com.company;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        int hora;

        System.out.println("Introduce la hora (1-24)");
        System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
        hora = sc.nextInt();

        if (hora > 6 && hora < 12) {
            System.out.println("Buenos días!");
        } else {
            if (hora > 13 && hora < 20) {
                System.out.println("Buenas tardes!");
            } else {
                System.out.println("Buenas noches!");
            }
        }
    }
}