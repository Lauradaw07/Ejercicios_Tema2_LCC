package com.company;

import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {

        //Variables
        int num;
        int positivos = 0;
        int negativos = 0;
        int cont = 0;

        System.out.println("----------------------------------------------------");
        System.out.println("|    CONTADOR DE NÚMEROS POSITIVOS Y NEGATICVOS    |");
        System.out.println("----------------------------------------------------");

        do {
            System.out.println("Introduce un número:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num < 0){
                negativos += 1;
            }
            else {
                positivos += 1;
            }
            cont++;
        }while (cont < 10);

        System.out.println("Hay " + positivos + " números positivos y " + negativos + " números negativos");
    }
}
