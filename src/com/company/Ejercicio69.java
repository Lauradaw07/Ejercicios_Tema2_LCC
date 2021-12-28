package com.company;

import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {

        //Variables
        int num, suma = 0, contador = 0;
        float media;

        do {
            System.out.println("Introduce un número positivo:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            contador += 1;
            suma += num;
        }while (suma < 10000);

        media = suma /contador;

        System.out.println("El total es: " + suma);
        System.out.println("Contador = " + contador);
        System.out.println("La media es: " + media);

    }
}
