package com.company;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {

        //Título
        System.out.println("Minicuestionario");
        System.out.println("------------------");

        //Variables
        int puntos = 0;
        String respuesta;

        //Preguntas
        //Pregunta 1
        System.out.println("1. ¿Qué programa utilizamos para crear programas en Java?");
        System.out.println("a) Pseint");
        System.out.println("b) IntelliJ");
        System.out.println("c) Visual Studio Code");

        Scanner sc = new Scanner(System.in);
        respuesta = sc.nextLine();

        if (respuesta.equals("b")){
            puntos += 1;
        }

        //Pregunta 2
        System.out.println("2. ¿Qué tipo de base de datos organiza la información en forma de árbol al revés?");
        System.out.println("a) Jerárquica");
        System.out.println("b) Relacional");
        System.out.println("c) Orientada a objetos");

        respuesta = sc.nextLine();

        if (respuesta.equals("a")){
            puntos += 1;
        }

        //Pregunta 3
        System.out.println("3. ¿Qué palabra se utiliza para el Switch en Pseint?");
        System.out.println("a) Según");
        System.out.println("b) Si");
        System.out.println("c) Para");

        respuesta = sc.nextLine();

        if (respuesta.equals("a")){
            puntos += 1;
        }

        //Pregunta 4
        System.out.println("4. ¿Qué etiqueta se utiliza para subrayar en HTML?");
        System.out.println("a) /b");
        System.out.println("b) /i");
        System.out.println("c) /u");

        respuesta = sc.nextLine();

        if (respuesta.equals("c")){
            puntos += 1;
        }

        //Pregunta 5
        System.out.println("5. ¿Qué puerto del ordenador está dedicado al cable de internet?");
        System.out.println("a) RJ45");
        System.out.println("b) USB");
        System.out.println("c) Jack");

        respuesta = sc.nextLine();

        if (respuesta.equals("a")){
            puntos += 1;
        }

        //Pregunta 6
        System.out.println("6. ¿De qué tipo de relación laboral se trata en el caso de los autónomos?");
        System.out.println("a) Relación laboral ordinaria");
        System.out.println("b) No se considera una relación laboral");
        System.out.println("c) Relación laboral especial");

        respuesta = sc.nextLine();

        if (respuesta.equals("b")){
            puntos += 1;
        }

        //Pregunta 7
        System.out.println("7. ¿Qué se utiliza en Java para expresar una raíz?");
        System.out.println("a) Clase Math");
        System.out.println("b) Operador aritmético");
        System.out.println("c) Operador numérico");

        respuesta = sc.nextLine();

        if (respuesta.equals("a")){
            puntos += 1;
        }

        //Pregunta 8
        System.out.println("8. ¿Qué tipo de BBDD pueden ser modificadas?");
        System.out.println("a) BBDD estáticas");
        System.out.println("b) BBDD corporativas");
        System.out.println("c) BBDD dinámicas");

        respuesta = sc.nextLine();

        if (respuesta.equals("c")){
            puntos += 1;
        }

        //Pregunta 9
        System.out.println("9. ¿Con qué etiquetas se definen las filas y columnas de una tabla en HTML?");
        System.out.println("a) /ul y /li");
        System.out.println("b) /ol y /li");
        System.out.println("c) /tr y /td");

        respuesta = sc.nextLine();

        if (respuesta.equals("c")){
            puntos += 1;
        }

        //Pregunta 10
        System.out.println("10. ¿Qué componente suministra energía al equipo?");
        System.out.println("a) Ventilador");
        System.out.println("b) Fuente de alimentación");
        System.out.println("c) Disco duro");

        respuesta = sc.nextLine();

        if (respuesta.equals("b")){
            puntos += 1;
        }

        System.out.println("------------------------------");
        System.out.println("Tu puntuación es: " + puntos);
    }
}
