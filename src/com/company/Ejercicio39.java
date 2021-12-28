package com.company;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {

        //Título
        System.out.println("Pintar pirámide");
        System.out.println("-----------------");

        //Variables
        int respuesta;

        //Leer variables
        System.out.println("Selecciona la dirección del vértice de la pirámide");
        System.out.println("1 -> Arriba");
        System.out.println("2 -> Abajo");
        System.out.println("3 -> Izquierda");
        System.out.println("4 -> Derecha");

        Scanner sc = new Scanner(System.in);
        respuesta = sc.nextInt();

        switch (respuesta){
            case 1:
                System.out.println("\s\s\s\s\s\s\s\s*\s\s\s\s\s\s\s\s");
                System.out.println("\s\s\s\s\s\s\s***\s\s\s\s\s\s\s");
                System.out.println("\s\s\s\s\s\s*****\s\s\s\s\s\s");
                System.out.println("\s\s\s\s\s*******\s\s\s\s\s");
                System.out.println("\s\s\s\s*********\s\s\s\s");
                break;
            case 2:
                System.out.println("\s\s\s\s*********\s\s\s\s");
                System.out.println("\s\s\s\s\s*******\s\s\s\s\s");
                System.out.println("\s\s\s\s\s\s*****\s\s\s\s\s\s");
                System.out.println("\s\s\s\s\s\s\s***\s\s\s\s\s\s\s");
                System.out.println("\s\s\s\s\s\s\s\s*\s\s\s\s\s\s\s\s");
                break;
            case 3:
                System.out.println("\s\s\s\s\s");
                System.out.println("\s\s\s\s*");
                System.out.println("\s\s\s**");
                System.out.println("\s\s***");
                System.out.println("\s****");
                System.out.println("\s\s***");
                System.out.println("\s\s\s**");
                System.out.println("\s\s\s\s*");
                System.out.println("\s\s\s\s\s");
                break;
            case 4:
                System.out.println("\s\s\s\s\s");
                System.out.println("\s*\s\s\s");
                System.out.println("\s**\s\s");
                System.out.println("\s***\s");
                System.out.println("\s****");
                System.out.println("\s***\s");
                System.out.println("\s**\s\s");
                System.out.println("\s*\s\s\s");
                System.out.println("\s\s\s\s\s");
        }
    }
}
