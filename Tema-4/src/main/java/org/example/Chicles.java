package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Chicles {

    static Scanner teclado;

    public static boolean casoDePrueba() {
        String datos = teclado.nextLine();
        String datos_entrada[] = datos.split(" ");

        //varias cosas en una linea
        if (Integer.parseInt(datos_entrada[0])==0){
        return false;
        }
        else {
            // CÓDIGO PRINCIPAL AQUÍ
            System.out.println(Arrays.toString(datos_entrada));
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }// main

    public static int[] pedirdatos(int numeros){
        int datos []= new int[3];
        datos[0]=numeros;
        for (int i = 1; i < datos.length ; i++) {

        }
        return datos;
    }
}
