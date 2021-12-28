package com.company;

public class Ejercicio56 {
    public static void main(String[] args) {

        //Variable
        int num = 320;

        System.out.println("-----------------------------------------------------------------");
        System.out.println("|    NÚMEROS DEL 320 AL 160, CONTANDO DE 20 EN 20 (DO-WHILE)    |");
        System.out.println("-----------------------------------------------------------------");

        do {
            num -= 20;
            System.out.println(num);
        }while (num > 160);
    }
}
