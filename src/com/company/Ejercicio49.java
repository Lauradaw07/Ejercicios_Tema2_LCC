package com.company;

import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {

        //Variables
        int num, cifra = 0;

        do {
            System.out.println("Introduce un número positivo:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        }while (num < 0);

        while (num > 0){
           cifra = num % 10;
           num = num / 10;
            System.out.println(cifra);
        }

    }
}
