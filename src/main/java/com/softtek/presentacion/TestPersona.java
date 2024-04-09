package com.softtek.presentacion;

import com.softtek.modelo.tiposenumerados.ejercicio1.EstadoCivil;
import com.softtek.modelo.tiposenumerados.ejercicio1.Persona;

public class TestPersona {
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        personas[0] = new Persona("Pepe", EstadoCivil.CASADO);
        personas[1] = new Persona("Juan", EstadoCivil.DIVORCIADO);
        personas[2] = new Persona("Manolo", EstadoCivil.SOLTERO);
        personas[3] = new Persona("Paco", EstadoCivil.VIUDO);

        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
    }
}
