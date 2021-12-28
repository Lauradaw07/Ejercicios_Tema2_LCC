package com.company;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {

        //Título
        System.out.println("Calcular segundos hasta la media noche:");
        System.out.println("-----------------------------------------");

        //Variables
        double horas, minutos, totalHoras, segundos;

        //Lectura de variables
        System.out.println("Introduce las horas");
        Scanner sc = new Scanner(System.in);
        horas = sc.nextDouble();

        System.out.println("Introduce los minutos");
        minutos = sc.nextDouble();

        //Operaciones
        minutos /= 60;

        horas += minutos;

        totalHoras = (24 - horas);

        segundos = (totalHoras*3600);

        System.out.println("Faltan " + segundos + " segundos para la media noche");
    }
}
