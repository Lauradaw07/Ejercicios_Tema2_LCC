package com.company;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {

        //Variables
        int respuesta;
        boolean salida = false;

        do {
            System.out.println("***********************************");
            System.out.println("*         TABLAS DE VERDAD        *");
            System.out.println("***********************************");
            System.out.println("¿Qué operador quieres mostrar?");
            System.out.println("1. Operador (&&)");
            System.out.println("2. Operador (||)");
            System.out.println("3. Operador (!)");
            System.out.println("4. Cerrar el programa" + "\n");

            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch (respuesta){
                case 1:
                    System.out.println("TABLA DE VERDAD (&&):");
                    System.out.println("-------------------------------");
                    System.out.println("| Valor A" + "\s" + "\s" + "Valor B" + "\s" + "\s" + "Resultado |");
                    System.out.println("-------------------------------");
                    System.out.println("| True" + "\s" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("| True" + "\s" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("| False" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("| False" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("------------------------------- \n");

                    break;
                case 2:
                    System.out.println("TABLA DE VERDAD (||):");
                    System.out.println("-------------------------------");
                    System.out.println("| Valor A" + "\s" + "\s" + "Valor B" + "\s" + "\s" + "Resultado |");
                    System.out.println("-------------------------------");
                    System.out.println("| True" + "\s" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("| True" + "\s" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("| False" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" +"|");
                    System.out.println("| False" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("------------------------------- \n\n");
                    break;
                case 3:
                    System.out.println("TABLA DE VERDAD (!)");
                    System.out.println("------------------------");
                    System.out.println("| Valor" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "Resultado |");
                    System.out.println("------------------------");
                    System.out.println("| True" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "False" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("| False" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "True" + "\s" + "\s" + "\s" + "\s" + "\s" + "\s" + "|");
                    System.out.println("------------------------ \n\n");
                    break;
                case 4:
                    salida = true;
                    break;
            }

        }while (!salida);


    }
}
