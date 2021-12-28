package com.company;

import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {

        //Variables
        String password = "4789";
        String answer;
        int cont = 0;



        do {
            System.out.println("Introduce la contraseña de la caja fuerte:");
            Scanner sc = new Scanner(System.in);
            answer = sc.nextLine();
            if (answer.equals(password)){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente" + "\n");
                cont = 4;
            }
            else {
                System.out.println("Lo siento, esa no es la combinación" + "\n");
            }
            System.out.println("------------------------------------------------------");
            cont++;
        }while (cont < 4);

    }
}
