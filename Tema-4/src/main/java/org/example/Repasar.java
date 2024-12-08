package org.example;

import java.util.Scanner;

public class Repasar {
     static Scanner teclado = new Scanner(System.in);

    //salida por pantalla del programa
    public static void salida() {
        System.out.println("Dime un numero y te lo daré en cubo:");
        int num = teclado.nextInt();
        System.out.println(calcularCubo(num));

    }
    public static int calcularCubo(int num){
        int f = num*num*num;
        return f;
    }
}

