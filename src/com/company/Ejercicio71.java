package com.company;

import java.util.Scanner;

public class Ejercicio71 {
    public static void main(String[] args) {

        //Variables
        int max, suma = 0, contador = 0;

        System.out.println("-------------------------------------------");
        System.out.println("|    MÚLTIPLOS DE 3 DENTRO DE UN RANGO    |");
        System.out.println("-------------------------------------------");
        System.out.println("Introduce el valor máximo del rango:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();

        System.out.println("\n" + "Los múltiplos de 3 son:");
        for (int i = 1; i <= max; i++){
            if (i % 3 == 0){
                System.out.println(i);
                contador += 1;
                suma += i;
            }
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("El total de múltiplos comprendidos en el rango es: " + contador);
        System.out.println("La suma de los múltiplos de 3 es: " + suma);

    }
}
