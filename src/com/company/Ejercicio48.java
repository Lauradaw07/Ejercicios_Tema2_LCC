package com.company;

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {

        //Variable
        int num;
        int factorial = 1;

        do {
            System.out.println("Introduce un número positivo:");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        }while (num < 0);

        while (num!=0){
            factorial = factorial * num;
            num--;
        }

        System.out.println("El resultado es: " + factorial);

    }
}
