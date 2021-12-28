package com.company;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {

        //Título
        System.out.println("Número divisible entre 2 y 5");
        System.out.println("------------------------------");

        //Variables
        int num, divDos, divCinco;

        //Leer variables
        System.out.println("Introduce un número");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //Operaciones
        //Divisible entre 2
        divDos = num%2;
        if (divDos == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }

        divCinco = num%5;
        if (divCinco == 0){
            System.out.println("El número es divisible entre 5");
        }
        else{
            System.out.println("EL número no es divisible entre 5");
        }
    }
}
