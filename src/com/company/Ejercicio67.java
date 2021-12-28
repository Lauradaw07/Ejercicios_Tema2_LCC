package com.company;

import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {

        //Variables
        int num;
        String caracter;


        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------------------");
        System.out.println("|                    PINTAR PIRÁMIDE                    |");
        System.out.println("---------------------------------------------------------");

        System.out.println("Introduce el carácter con el que se pintará la pirámide:");
        caracter = sc.nextLine();

        System.out.println("Introduce la altura de la pirámide:");
        num = sc.nextInt();

        for (int altura = 1; altura <= num; altura++){
            for (int espacios = 1; espacios <= num - altura; espacios++){
                System.out.print(" ");
            }
            for (int dibujo = 1; dibujo <= (altura * 2) - 1; dibujo++){
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
