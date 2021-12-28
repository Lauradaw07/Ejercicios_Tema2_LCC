package com.company;

public class Ejercicio33 {
    public static void main(String[] args) {

        System.out.println("Resolver una ecuación de 2º grado:");
        System.out.println("ax2+bx+c = 0");
        System.out.println("------------------------------------");

        //Variables
        double a, b, c, x1, x2, raiz, potencia;

        //Operaciones
        a = 1;

        b = -5;

        c = 6;

        potencia = Math.pow(-b,2);

        raiz = Math.sqrt(potencia - 4 * a * c);

        x1 = (-b + raiz)/ (2 * a);

        x2 = (-b - raiz)/ (2*a);

        //Soluciones
        System.out.println("Las soluciones son:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
