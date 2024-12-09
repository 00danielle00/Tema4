package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jeroglificos {

    static Scanner teclado= new Scanner(System.in);

    //Establezco 2 vectores con valores fijos ya que no van a cambiar durante el programa
    static int valores[]={1000000,100000,10000,1000,100,10,1};
    static char jeroglificos[]={'H','R','D','F','C','G','T'};

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {

        }
    }
    public static boolean casoDePrueba() {
        System.out.println("Introduce numeros para pasarlos a jeroglíficos: ");
        int dato =0;
        try {//implemento un try catch en el caso de que el usuario intente introducir un caracter
             dato = teclado.nextInt();
        }catch (InputMismatchException err){
            System.out.println("ERROR: Introduce un valor válido!");
            return false;
        }
        if (dato==0){// condicion que si el dato introducido es 0 el programa se parará
            return false;
        }else {
            int entrada[] = pedirUsuario(dato);
            
            for (int i = 0; i < entrada.length; i++) {
               int entrad = entrada[i];
               String convertir=repetir(entrad);
               System.out.println(convertir);
            }
            return true;
        }

    }
    //Pedir datos a usuario para convrtirlo en jeroglíficos
    public static int [] pedirUsuario (int dato){
        int datos []=new int[dato];

        for (int i = 0; i < datos.length; i++) {
            datos[i]= teclado.nextInt();
        }

        return datos;
    }
    //Convierto los números a jeroglíficos
    public static String repetir( int numero){

        String resultado = "";

        for (int i = 0; i < valores.length ; i++) {
            while (numero>=valores[i]){
                resultado+=valores[i]; //añadir directamente los valores
                numero-=valores[i]; // reducimos el número para obtener el siguiente dígito a convertir en
            }
        }
        return resultado;
    }

    //imprimir valores tantas veces sea el número
    public static String imprimirvalores (char digito, int veces){

        String resultado2="";

        for (int i = 0; i < veces; i++) {
            resultado2+=digito;
        }
        System.out.println(resultado2);
        return resultado2;

    }
}
