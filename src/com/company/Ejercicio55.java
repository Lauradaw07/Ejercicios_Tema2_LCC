package com.company;

public class Ejercicio55 {
    public static void main(String[] args) {

        //Variable
        int num = 320;

        System.out.println("--------------------------------------------------------------");
        System.out.println("|    NÚMEROS DEL 320 AL 160, CONTANDO DE 20 EN 20 (WHILE)    |");
        System.out.println("--------------------------------------------------------------");
        while (num > 160){
            num -= 20;
            System.out.println(num);
        }
    }
}
