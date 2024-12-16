package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Danielle
 */

public class Jeroglificos {


    static Scanner teclado= new Scanner(System.in);

    //Establezco 2 arrays con valores fijos ya que no van a cambiar durante el programa
    static int valores[]={1000000,100000,10000,1000,100,10,1};
    static char jeroglificos[]={'H','R','D','F','C','G','T'};

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    /**
     *
     * @return un número convertido a jeroglífico
     */
    public static boolean casoDePrueba() {

        System.out.println("Introduce un número para convertirlo en jeroglífico:");
        int dato =0;
        try {//implemento un try catch en el caso de que el usuario intente introducir un caracter
             dato = teclado.nextInt();
        }catch (InputMismatchException err){
            System.out.println("ERROR: Introduce un valor válido!");
            return false;
        }
        if (dato<0 || dato>9999999){//limita los valores para que estén dentro de un cierto rango
            System.out.println("El número que has introducido está fuera de rango");
            return false;
        }
        if (dato==0){// condicion que si el dato introducido es 0 el programa se parará
            return false;
        }else {
            String resultado = convertir(dato);
            System.out.println("Jeroglíficos: " + resultado);
            return true;
        }
    }
    /**
     * Este método convierte los números introducidos por el usuario en Letras que representan los jeroglíficos
     * @param numero representa un número entero que pasaremos a Jeroglífico
     * @return devuelve el numero introducido en jeroglífico
     */

    public static String convertir( int numero){
        String resultado = ""; // cadena en donde se acumularán los resultados obtenidos del bucle

        for (int i = 0; i < jeroglificos.length ; i++) {//recorre el array 'jeroglificos'
            while (numero>=valores[i]){
                resultado+=jeroglificos[i]; //añadir directamente los valores
                numero-=valores[i]; // reducimos el número para obtener el siguiente dígito a convertir
            }
        }
        return resultado;
    }

}
