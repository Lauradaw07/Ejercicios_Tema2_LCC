package com.company;

import java.util.Scanner;

public class Ejercicio32 {
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

        if (media < 5){
            System.out.println("Insuficiente");
        }
        else {
            if (media >= 5 && media < 6){
                System.out.println("Suficiente");
            }
            if (media >= 6 && media < 7){
                System.out.println("Bien");
            }
            if (media >= 7 && media < 9){
                System.out.println("Notable");
            }
            if (media >9 && media <= 10){
                System.out.println("Sobresaliente");
            }
        }
    }
}
