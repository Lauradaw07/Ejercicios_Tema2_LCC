package com.company;

import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {

        //Variable
        String num;

        System.out.println("Introduce un número:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();

        System.out.println("El número tiene " + num.length() + " dígitos");
    }
}
