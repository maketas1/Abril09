package com.softtek.modelo.ejercicio1;

import lombok.*;

@Data
public class Globo {
    public static int CONTADOR=0;
    private final int ID;

    public Globo() {
        this.ID = ++CONTADOR;
    }
}
