package com.company;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {

        System.out.println("Calcular media de tres notas");
        System.out.println("------------------------------");

        double nota1, nota2, nota3, media;

        System.out.println("Introduce la primera nota");
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextDouble();

        System.out.println("Introduce la segunda nota");
        nota2 = sc.nextDouble();

        System.out.println("Introduce la tercera nota");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        System.out.println("La media es: " + media);
    }
}
