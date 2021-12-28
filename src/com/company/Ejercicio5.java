package com.company;

public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println(ANSI_BLUE + "\t BBDD" + ANSI_PURPLE + "\t\t FOL " + ANSI_BLUE + "\t\t BBDD" + ANSI_YELLOW + "\t\t Sistemas" + ANSI_RED + "\t\t Prog");
        System.out.println(ANSI_BLUE + "\t BBDD" + ANSI_GREEN + "\t\t Entornos" + ANSI_BLUE + "\t BBDD" + ANSI_YELLOW + "\t\t Sistemas" + ANSI_RED + "\t\t Prog");
        System.out.println(ANSI_YELLOW + "\t Sistemas" + ANSI_WHITE + "\t LMSGI" + ANSI_YELLOW + "\t\t Sistemas" + ANSI_WHITE + "\t LMSGI" + ANSI_PURPLE + "\t\t\t FOL");
        System.out.println(ANSI_BLACK + "\t\t R \t\t\t E \t\t\t CR \t\t E \t\t\t\t O");
        System.out.println(ANSI_YELLOW + "\t Sistemas" + ANSI_WHITE + "\t LMSGI" + ANSI_YELLOW + "\t\t Sistemas" + ANSI_WHITE + "\t LMSGI" + ANSI_BLUE + "\t\t\t BBDD");
        System.out.println(ANSI_RED + "\t Prog" + ANSI_RED + "\t\t Prog" + ANSI_GREEN + "\t\t Entornos" + ANSI_RED + "\t Prog" + ANSI_BLUE + "\t\t\t BBDD");
        System.out.println(ANSI_RED + "\t Prog" + ANSI_RED + "\t\t Prog" + ANSI_PURPLE + "\t\t FOL" + ANSI_RED + "\t\t Prog" + ANSI_GREEN + "\t\t\t Entornos");
    }
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
