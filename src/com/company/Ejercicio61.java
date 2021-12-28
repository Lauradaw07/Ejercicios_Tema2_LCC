package com.company;

import java.util.Scanner;

public class Ejercicio61 {
    public static void main(String[] args) {

        int numTerminos;
        int contador = 0;
        int primero = 0;
        int segundo = 1;
        int aux;

        //Leer número de vueltas
        System.out.println("Introduce el número de términos que se van a mostrar");
        Scanner sc = new Scanner(System.in);
        numTerminos = sc.nextInt();

        System.out.println("-------------------------------------------------------");

        System.out.println(primero);
        System.out.println(segundo);

        while (contador < numTerminos){

            System.out.println(primero + segundo);

            aux = segundo;
            segundo = (primero + segundo);
            primero = aux;

            contador++;
        }
    }
}
