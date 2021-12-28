package com.company;

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {

        //Variables
        int year;

        System.out.println("Introduce el año");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year%4 == 0){
            System.out.println("El año es bisiesto");
        }
        else {
            System.out.println("El año no es bisiesto");
        }

    }
}
