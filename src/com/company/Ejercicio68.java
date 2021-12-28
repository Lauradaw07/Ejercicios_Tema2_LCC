package com.company;

import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {

        //Variables
        int num, numerosIntroducidos = 0, impares = 0, sumaImpares = 0, media;
        int numMayor = 0;

        System.out.println("---------------------------------------");
        System.out.println("|    CÁLCULOS CON LISTA DE NÚMEROS    |");
        System.out.println("---------------------------------------");
        do {
            System.out.println("Introduce un número entero:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            numerosIntroducidos += 1;

            if (num%2!=0){
                impares += 1;
                sumaImpares += num;
            }
            else {
                if (num > numMayor){
                    numMayor = num;
                }
            }
        }while (num > 0);

        media = sumaImpares / impares;

        System.out.println("Se han introducido " + (numerosIntroducidos - 1) + " números");
        System.out.println("La media de los impares es: " + media);
        System.out.println("El mayor de los pares es: " + numMayor);
    }
}
