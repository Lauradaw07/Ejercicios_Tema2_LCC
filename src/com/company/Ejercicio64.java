package com.company;

import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String[] args) {

        //Variables
        int num;

        System.out.println("Introduce un número:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num/num == 0 && num/1 == 0){
            System.out.println("El número es primo");
        }
        else {
            System.out.println("El número no es primo");
        }
    }
}
