package org.example;

import java.lang.foreign.SymbolLookup;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Modular {


    public static void caraCruz() {

        mostrar_opciones();
        String opcion_usuario = recogeropcion();
        String opcion_sorteo = sorteo();
        comprobar_resultado(opcion_usuario, opcion_sorteo);

    }

    public static void mostrar_opciones() {

        System.out.println("Bienvenido");
        System.out.println("Elige una opcion:");
        System.out.println("C - cara");
        System.out.println("X - cruz");

    }

    public static String recogeropcion() {

        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.next();
        return opcion;
    }

    public static String sorteo() {
        String opciones[] = {"cara", "cruz"};
        Random aleatorio = new Random();

        String sorteo = opciones[aleatorio.nextInt(2)];
        return sorteo;
    }

    public static void comprobar_resultado(String opcion, String sorteo) {

        if (opcion.equals(sorteo)) {
            System.out.println("Has ganado , ha salido: " + sorteo);

        } else {
            System.out.println("has perdido, ha salido: " + sorteo);
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////

    public static void ejercicio1() {
        mostrar();
        int opcion = preguntar_numeros();
        int preguntar = preguntar_numeros();
        calcular(preguntar);

    }

    public static void mostrar() {
        System.out.println("Dime un número");
        System.out.println("El resultado es: " + calcular(preguntar_numeros()));


    }

    public static int preguntar_numeros() {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        return numero;
    }

    public static int calcular(int numero) {

        int resultado = (numero * numero * numero);

        return resultado;

    }

    ///////////////////////////////////////////////////////////////////////////////////

    public static void ejercicio2() {
        mostrar_menu();
        int preguntar = opcion();
    }

    public static void mostrar_menu() {
        System.out.println("Seleccione las opciones:");
        System.out.println("Opcion1 :");
        System.out.println("Opcion2 :");
        System.out.println("Opcion3-Salir");

    }

    public static int opcion() {

        Scanner teclado = new Scanner(System.in);
        int opcion =0;
        try {
             opcion = teclado.nextInt();
        }catch (InputMismatchException err){
            System.out.println("Formato introducido no válido");
        }
        return opcion;
    }

}

