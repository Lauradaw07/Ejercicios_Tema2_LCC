package com.company;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {

        System.out.println("Calcular horóscopo según fecha de nacimiento");
        System.out.println("----------------------------------------------");

        //Variables
        int dia, mes;

        //Lectura variables
        System.out.println("Introduce tu día de nacimiento");
        Scanner sc = new Scanner(System.in);
        dia = sc.nextInt();

        System.out.println("Introduce tu mes de nacimiento");
        mes = sc.nextInt();

        //Según mes hacer
        switch (mes){
            case 1:
                if (dia >= 1 && dia <= 19){
                    System.out.println("Capricornio");
                }
                if (dia >= 20 && dia <= 31){
                    System.out.println("Acuario");
                }
                break;
            case 2:
                if (dia >= 1 && dia <= 18){
                    System.out.println("Acuario");
                }
                if (dia >= 19 && dia <= 28){
                    System.out.println("Piscis");
                }
                break;
            case 3:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Piscis");
                }
                if (dia >= 21 && dia <= 31){
                    System.out.println("Aries");
                }
                break;
            case 4:
                if (dia >= 1 && dia <= 19){
                    System.out.println("Aries");
                }
                if (dia >= 20 && dia <= 30){
                    System.out.println("Tauro");
                }
                break;
            case 5:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Tauro");
                }
                if (dia >= 21 && dia <= 31){
                    System.out.println("Géminis");
                }
                break;
            case 6:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Géminis");
                }
                if (dia >= 21 && dia <= 30){
                    System.out.println("Cáncer");
                }
                break;
            case 7:
                if (dia >= 1 && dia <= 22){
                    System.out.println("Cáncer");
                }
                if (dia >= 23 && dia <= 31){
                    System.out.println("Leo");
                }
                break;
            case 8:
                if (dia >= 1 && dia <= 22){
                    System.out.println("Leo");
                }
                if (dia >= 23 && dia <= 31){
                    System.out.println("Virgo");
                }
                break;
            case 9:
                if (dia >= 1 && dia <= 22){
                    System.out.println("Virgo");
                }
                if (dia >= 23 && dia <= 30){
                    System.out.println("Libra");
                }
                break;
            case 10:
                if (dia >= 1 && dia <= 22){
                    System.out.println("Libra");
                }
                if (dia >= 23 && dia <= 31){
                    System.out.println("Escorpio");
                }
                break;
            case 11:
                if (dia >= 1 && dia <= 21){
                    System.out.println("Escorpio");
                }
                if (dia >= 22 && dia <= 30){
                    System.out.println("Sagitario");
                }
                break;
            case 12:
                if (dia >= 1 && dia <= 21){
                    System.out.println("Sagitario");
                }
                if (dia >= 22 && dia <= 31){
                    System.out.println("Capricornio");
                }
                break;
        }
    }
}
