package org.example;

import java.util.Scanner;

/**
 * @author Dani
 * @version 1.0 (10-12-2024)
 */
public class Ventas {
    static Scanner teclado;


    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {

        }
    }
    public static boolean casoDePrueba() {
        float dato = teclado.nextFloat(); //mientras no se introduzca el -1 se ejecutará
        if (dato==-1){
        return false;
        }else {
            float semanas []=rellenarDatos(dato);
            System.out.println("-------");
            return true;
        }
    }

    /**
     * @author
     * @version
     * Metodo para rellenar 
     * @param dato se recibe un numero para poder comppletar el array
     * @return datos[] te devolvemos un array con los datos de entrada
     */
    public static float[] rellenarDatos(float dato){

        float datos[]= new float[6];

        datos[0]=dato;

        for (int i = 1; i <datos.length ; i++) {
            datos[i]= teclado.nextFloat();
        }
        return datos;
    }
}
