package com.softtek.modelo.prueba;

import lombok.*;

@AllArgsConstructor
@Data
public final class Producto {
    public static int CONTADOR=0;
    private final int ID;
    private String nombre;
    private double precio;

    public Producto() {
        this.ID = ++CONTADOR;
    }

    public final double importe(int cantidad) {
        return cantidad*precio;
    }
}
