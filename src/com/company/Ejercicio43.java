package com.company;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {

        //Variables
        String num;


        System.out.println("Introduce un número entero");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();

        System.out.println("El número tiene " + num.length() + " dígitos.");

    }
}
