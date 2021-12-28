package com.company;

import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {

        //Variables
        int dia = 0, mes = 0, diasTotales = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un día:");

            dia = sc.nextInt();
        }while (dia < 0 || dia > 31);

        do {
            System.out.println("Introduce un mes:");
            mes = sc.nextInt();
        }while (mes < 0 || mes > 12);

        switch (mes){
            case 1:
                diasTotales += dia - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 2:
                diasTotales = (31 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 3:
                diasTotales = (59 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 4:
                diasTotales = (90 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 5:
                diasTotales = (120 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 6:
                diasTotales = (151 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 7:
                diasTotales = (181 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 8:
                diasTotales = (212 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 9:
                diasTotales = (243 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 10:
                diasTotales = (273 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 11:
                diasTotales = (304 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
            case 12:
                diasTotales = (334 + dia) - 1;
                System.out.println("Han pasado " + diasTotales + " días desde el 1 de enero");
                break;
        }
    }
}
