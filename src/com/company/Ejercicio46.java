package com.company;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {

        //Variables
        double precio;
        double precioFinal;
        double descuento5;
        double descuento10;
        double descuento15;

        System.out.println("Introduce el precio de la compra");
        Scanner sc = new Scanner(System.in);
        precio = sc.nextInt();
        System.out.println("*********************************");

        if (precio < 200){
            System.out.println("No tienes descuento!!");
            System.out.println("El precio final es: " + precio + "€");
        }
        else {
            if (precio > 200 && precio < 500){
                descuento5 = precio * 0.05;
                precioFinal = precio - descuento5;
                System.out.println("Tienes un descuento del 5%!!");
                System.out.println("El precio final es: " + precioFinal + "€");
            }
            else {
                if (precio > 501 && precio < 1000){
                    descuento10 = precio * 0.10;
                    precioFinal = precio - descuento10;
                    System.out.println("Tienes un descuento del 10%!!");
                    System.out.println("El precio final es: " + precioFinal + "€");
                }
                else {
                    if (precio > 1000){
                        descuento15 = precio * 0.15;
                        precioFinal = precio - descuento15;
                        System.out.println("Tienes un descuento del 15%!!");
                        System.out.println("El precio final es: " + precioFinal + "€");
                    }
                }
            }
        }

    }
}
