package com.company;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        String diaSem;

        System.out.println("Introduce el día de la semana:");
        System.out.println("-------------------------------");

        Scanner sc = new Scanner(System.in);
        diaSem = sc.nextLine();

        switch (diaSem) {
            case "lunes":
                System.out.println("Bases de datos");
                break;
            case "martes":
                System.out.println("FOL");
                break;
            case "miércoles":
                System.out.println("Bases de datos");
                break;
            case "jueves":
                System.out.println("Sistemas informáticos");
                break;
            case "viernes":
                System.out.println("Programación");
                break;
            default:
                System.out.println("Día de la semana no válido");
        }
    }
}
