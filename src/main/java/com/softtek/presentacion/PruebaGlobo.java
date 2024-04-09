package com.softtek.presentacion;

import com.softtek.modelo.ejercicio1.Globo;

public class PruebaGlobo {
    public static void main(String[] args) {
        Globo[] globos = new Globo[4];
        for (int i = 0; i < globos.length; i++) {
            globos[i] = new Globo();
            System.out.println(globos[i].toString());
        }
    }
}
