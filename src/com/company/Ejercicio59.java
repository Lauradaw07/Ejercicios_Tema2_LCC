package com.company;

import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {

        //Variables
        float nota;
        float suma = 0;
        boolean bandera = false;
        int cont = 0;
        float media;

        System.out.println("-----------------------------");
        System.out.println("|       CALCULAR MEDIA      |");
        System.out.println("-----------------------------" + "\n");

        do {
;
            System.out.println("Introduce una nota:");
            Scanner sc = new Scanner(System.in);
            nota = sc.nextInt();
            if (nota > 0 && nota < 710){
              suma += nota;
            }
            else {
                bandera = true;
            }
            cont++;
        }while (!bandera);

        media = suma/(cont-1);
        System.out.println("La media es: " + media);

    }
}
