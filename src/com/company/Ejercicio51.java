package com.company;

public class Ejercicio51 {
    public static void main(String[] args) {

        //Variables
        int num = 0;
        int suma = 0;


        System.out.println("MÚLTIPLOS DE 5, PERO NO DE 3:");
        System.out.println("-----------------------------" + "\n");

        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0){
                if (i % 3 != 0){
                    System.out.println(i);
                }
            }
        }
    }
}
