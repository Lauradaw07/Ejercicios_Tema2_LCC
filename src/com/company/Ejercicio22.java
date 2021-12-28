package com.company;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        double L1, L2, L3;

        /*
        System.out.println("Introduce los lados del triángulo");
        Scanner sc = new Scanner(System.in);
        L1 =sc.nextDouble();
        System.out.println();
        L2 = sc.nextDouble();
        System.out.println();
        L3 = sc.nextDouble(); */

        System.out.println("Introduce el primer lado del triángulo");
        Scanner sc =  new Scanner(System.in);
        L1 = sc.nextDouble();

        System.out.println("Introduce el segundo lado del triángulo");
        L2 = sc.nextDouble();

        System.out.println("Introduce el tercer lado del triángulo");
        L3 = sc.nextDouble();

        double SP = ((L1 + L2 + L3)/2);

        double area = (Math.sqrt(SP * (SP - L1) * (SP - L2) * (SP - L3)));

        System.out.println("El área del triángulo es: " + area);
    }
}
