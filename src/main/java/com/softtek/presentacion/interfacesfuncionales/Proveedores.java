package com.softtek.presentacion.interfacesfuncionales;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Proveedores {
    public static void main(String[] args) {
        apartado1();
        apartado2();
        apartado3();
        apartado4();
    }

    public static void apartado1() {
        System.out.println("Apartado 1");
        Supplier<Integer> aleatorio = () -> {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(5, 10);
            return numeroAleatorio;
        };
        System.out.println(aleatorio.get());
        System.out.println(" ");
    }

    public static void apartado2() {
        System.out.println("Apartado 2");
        Supplier<String> lista = () -> {
            ArrayList<String> lista1 = new ArrayList<>();
            lista1.add("Pepe");
            lista1.add("Juan");
            return lista1.toString();
        };
        System.out.println(lista.get());
        System.out.println(" ");
    }

    public static void apartado3() {
        System.out.println("Apartado 3");
        Supplier<LocalDateTime> fecha = () -> LocalDateTime.now();
        System.out.println(fecha.get());
        System.out.println(" ");
    }

    public static void apartado4() {
        System.out.println("Apartado 4");
        Supplier<String> vacia = () -> "";
        System.out.println(vacia.get());
        System.out.println(" ");
    }
}
