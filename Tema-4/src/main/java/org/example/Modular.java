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
        int opciones = opcion();
        mostrar_menu(opciones);
        int seleccion = seleccion_usuario(opciones);
    }
    public static void mostrar_menu(int opciones) {
        System.out.println("Menu de  opciones : ");
        for (int i = 1; i <=opciones ; i++) {
            System.out.println(i+" Opcion "+i);
        }
        System.out.println((opciones+1)+" .salir");
    }

    public static int opcion() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas opciones quieres: ");
        int opciones = 0;
        try {
             opciones = teclado.nextInt();
        }catch (InputMismatchException err){
            System.out.println("Formato introducido no válido");
        }
        return opciones;
    }

    public static int seleccion_usuario(int opciones){
        Scanner teclado = new Scanner(System.in);
        int seleccionar =0;

        boolean comprobar = false;
        do {
            System.out.println("Elige una opcion: 1-"+ (opciones+1)+" :");
            seleccionar= teclado.nextInt();

            if (seleccionar==0){
                System.out.println("Numero fuera del rango");
            } else if (seleccionar>=1 && seleccionar<=opciones+1) {
                comprobar=true;
                if (seleccionar == opciones+1){
                    System.out.println("Saliendo del programa...");
                }else {
                    System.out.println("has elegido la opcion"+seleccionar);
                }
            }


        }while (!comprobar);
        return seleccionar;
    }
    ///////////////////////////////////////////////////////

    public static void ejercicio3(){
        String mostrar = cadena_usuario();
        String mayuscula =metodo1(mostrar);
        metodo2(mayuscula);

    }
    public static String cadena_usuario (){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una cadena :");
        String cadena = teclado.next();
        return cadena;
    }
    public static String metodo1(String cadena){

        String mayuscula =cadena.toUpperCase();
        System.out.println(mayuscula);
        return mayuscula;

    }
    public static boolean vocal ( char v){
        return v == 'a' || v == 'e' || v == 'i' || v == 'o'  || v == 'u' ||
                v=='A' || v == 'E' || v=='I' || v=='O'||v=='U';
    }
    public static String metodo2( String mayuscula){
        int vocales =0;
        for (int i = 0; i < mayuscula.length(); i++) {
            char v = mayuscula.charAt(i);
            if (vocal(v)){
                vocales++;
            }

        }
        System.out.println("Hay "+vocales+" vocales");
        return mayuscula;
    }

}

