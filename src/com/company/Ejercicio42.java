package com.company;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {

        //Variables
        int num, primeraCifra = 0;


        System.out.println("Introduce un número (máx 5 números): ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();


        if (num < 10){
            primeraCifra = num;
            System.out.println("La primera cifra es: " + primeraCifra);
        }

        if ((num >= 10) && (num < 100)){
            primeraCifra = num / 10;
            System.out.println("La primera cifra es: " + primeraCifra);
        }

        if ((num >= 100) && (num < 1000)){
            primeraCifra = num / 100;
            System.out.println("La primera cifra es: " + primeraCifra);
        }

        if ((num >= 1000) && (num < 10000)){
            primeraCifra = num / 1000;
            System.out.println("La primera cifra es: " + primeraCifra);
        }

        if (num >= 10000){
            primeraCifra = num / 10000;
            System.out.println("La primera cifra es: " + primeraCifra);
        }
    }
}
