package com.company;

import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {

        //Variables
        int num;
        long suma = 0;

        System.out.println("-------------------------------------");
        System.out.println("|    SUMA 100 NÚMEROS SIGUIENTES    |");
        System.out.println("-------------------------------------");
        do {
            System.out.println("Introduce un número positivo:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            if (num < 0){
                System.out.println("\s" + "\s" + "\s" + "El número debe ser positivo" + "\n");
            }
        }while (num < 0);

        for (int i = num; i < num + 100; i++){
            suma += i;
        }

        System.out.println("El resultado de la suma es: " + suma);
    }
}
