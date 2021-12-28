package com.company;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {

        //Variables
        int num;
        int aux;
        int inverso = 0;
        int ultimaCifra;

        do {
            System.out.println("Introduce un número positivo: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
        }while (num < 10);


        aux = num;
        do {
            ultimaCifra = aux % 10;
            inverso = inverso * 10 + ultimaCifra;
            aux = aux / 10;
        }while (aux!=0);

        if (num == inverso){
            System.out.println("El número es capicúa");
        }
        else {
            System.out.println("El número no es capicúa");
        }
    }
}
