package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio70 {
    public static void main(String[] args) {

        //Variables
        int num, digito, ultimaCifra, aux, inverso = 0, posicion = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("|    POSICIÓN DE UN DÍGITO    |");
        System.out.println("-------------------------------");

        do {
            System.out.println("Introduce un número:");
            num = sc.nextInt();

            System.out.println("Introduce un dígito:");
            digito = sc.nextInt();
        }while (num < 0 || digito < 0);

        //Número inverso
        aux = num;
        do {
            ultimaCifra = aux % 10;
            inverso = inverso * 10 + ultimaCifra;
            aux = aux / 10;
        }while (aux!=0);

        //Posición
        while (inverso > 0){
            if (inverso % 10 == digito){
                System.out.println("La posición del dígito es: " + posicion);
            }
            inverso /= 10;
            posicion++;
        }



    }
}
