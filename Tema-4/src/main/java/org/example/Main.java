package org.example;

public class Main {
    public static void main(String[] args) {

        int grados = 17;

        int grados_kelvin = Metodos.grados_kelvin(grados);

        System.out.println("los "+grados+" grados celsius convertidos a kelvin son "+grados_kelvin);
    }
}
