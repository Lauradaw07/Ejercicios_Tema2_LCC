package com.company;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        int num;

        System.out.println("Día de la semana según el número");
        System.out.println("----------------------------------");

        System.out.println("Introduce un número (1-7)");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Lunes!");
                break;
            case 2:
                System.out.println("Martes!");
                break;
            case 3:
                System.out.println("Miércoles!");
                break;
            case 4:
                System.out.println("Jueves!");
                break;
            case 5:
                System.out.println("Viernes!");
                break;
            case 6:
                System.out.println("Sábado!");
                break;
            case 7:
                System.out.println("Domingo!");
                break;
        }
    }
}
