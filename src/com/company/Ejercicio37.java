package com.company;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {

        //Variables
        int num1, num2, num3;
        int a, b, c;

        a = 0;
        b = 0;
        c = 0;

        //Leer variables
        System.out.println("Introduce el primer número");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número");
        num2 = sc.nextInt();

        System.out.println("Introduce el tercer número");
        num3 = sc.nextInt();

        //Condiciones
        //Primer número
        if (num1 < num2 && num1 < num3){
            a = num1;
        }
        if (num1 > num2 && num1 < num3){
            b = num1;
        }
        if (num1 > num2 && num1 > num3){
            c = num1;
        }

        //Segundo número
        if (num2 < num1 && num2 < num3){
            a = num2;
        }
        if (num2 > num1 && num2 < num3){
            b = num2;
        }
        if (num2 > num1 && num2 > num3){
            c = num2;
        }

        //Tercer número
        if (num3 < num1 && num3 < num2){
            a = num3;
        }
        if (num3 > num1 && num3 < num2){
            b = num3;
        }
        if (num3 > num1 && num3 > num2){
            c = num3;
        }

        //Solución
        System.out.println( "El orden es: " + a + "\s" + b + "\s" + c);
    }
}
