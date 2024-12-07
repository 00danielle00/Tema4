package org.example;

import java.util.Scanner;

public class Jeroglificos {

    static Scanner teclado;

    //2 vectores con valores fijos ya que no van a cambiar
    static int valores[]={1,10,100,1000,10000,100000,1000000};
    static char jeroglificos[]={'T','G','C','F','D','R','H'};

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {

        }
    }
    public static boolean casoDePrueba() {
        System.out.println("Introduce numeros para pasarlos a jeroglíficos: ");
        int dato = teclado.nextInt(); //mientras no se introduzca el -1 se ejecutará
        if (dato==0){
            return false;
        }else {
            int entrada[] = pedirUsuario(dato);
            System.out.println("-------");


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
                numero-=valores[i]; // reducimos el número para obtener el siguiente dígito
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
        return resultado2;

    }
}
