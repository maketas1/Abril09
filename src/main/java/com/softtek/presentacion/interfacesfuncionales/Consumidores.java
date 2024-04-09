package com.softtek.presentacion.interfacesfuncionales;

import com.softtek.modelo.interfacesfuncionales.Producto;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        apartado1();
        apartado2();
        apartado3();
        apartado4();
        apartado5();
    }

    public static void apartado1() {
        System.out.println("Apartado 1");
        Consumer<String> mayusculas = x -> System.out.println(x.toUpperCase());
        mayusculas.accept("Hola mundo");
        System.out.println(" ");
    }

    public static void apartado2() {
        System.out.println("Apartado 2");
        Consumer<Integer> cuadrado = x -> {
            Integer operacion = x * x;
            System.out.println(x + " -> " + operacion);
        };
        cuadrado.accept(5);
        System.out.println(" ");
    }

    public static void apartado3() {
        System.out.println("Apartado 3");
        Consumer<Producto> producto = x -> System.out.println(x.toString());
        Producto p = new Producto("Leche", 10);
        producto.accept(p);
        System.out.println(" ");
    }

    public static void apartado4() {
        System.out.println("Apartado 4");
        Consumer<String> dialogo = x -> JOptionPane.showMessageDialog(null, x);
        dialogo.accept("Buenas tardes");
        System.out.println(" ");
    }

    public static void apartado5() {
        System.out.println("Apartado 5");
        Consumer<String> escribir = x -> {
            try {
                escribir(x);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        escribir.accept("Hola que tal");
        System.out.println(" ");
    }

    public static void escribir(String texto) throws IOException {
        File archivo=new File("fichero/apartado5.txt");
        FileWriter fw=new FileWriter(archivo);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(texto);
        bw.flush();
    }
}
