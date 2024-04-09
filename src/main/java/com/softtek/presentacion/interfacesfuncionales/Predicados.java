package com.softtek.presentacion.interfacesfuncionales;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        apartado1();
        apartado2();
        apartado3();
        apartado4();
    }

    public static void apartado1() {
        System.out.println("Apartado 1");
        Predicate<Integer> positivo = x -> x > 0;
        boolean resultado = positivo.test(10);
        System.out.println(resultado);
        System.out.println(" ");
    }

    public static void apartado2 () {
        System.out.println("Apartado 2");
        Predicate<String> cadenaVacia = a -> a.isEmpty();
        boolean resultado = cadenaVacia.test("Hola");
        System.out.println(resultado);
        System.out.println(" ");
    }

    public static void apartado3() {
        System.out.println("Apartado 3");
        Predicate<Integer> par = x -> x%2 == 0;
        boolean resultado = par.test(10);
        System.out.println(resultado);
        System.out.println(" ");
    }

    public static void apartado4() {
        System.out.println("Apartado 4");
        Predicate<Integer> mayor = x -> x > 5;
        boolean resultado = mayor.test(0);
        System.out.println("Es mayor que 5?" + resultado);
        System.out.println(" ");
    }
}
